import java.util.ArrayList;
import java.util.List;

class BTreeNode {
    int[] keys;
    BTreeNode[] children;
    int count;
    boolean leaf;

    BTreeNode(int degree, boolean leaf) {
        keys = new int[2 * degree - 1];
        children = new BTreeNode[2 * degree];
        count = 0;
        this.leaf = leaf;
    }
}

class BTree {
    BTreeNode root;
    int degree;

    BTree(int degree) {
        this.degree = degree;
        root = new BTreeNode(degree, true);
    }

    void traverse(BTreeNode node) {
        int i;

        for (i = 0; i < node.count; i++) {
            if (!node.leaf) {
                traverse(node.children[i]);
            }
            System.out.print(node.keys[i] + " ");
        }

        if (!node.leaf) {
            traverse(node.children[i]);
        }
    }

    boolean search(BTreeNode node, int key) {
        int i = 0;

        while (i < node.count && key > node.keys[i]) {
            i++;
        }

        if (i < node.count && node.keys[i] == key) {
            return true;
        }

        if (node.leaf) {
            return false;
        }

        return search(node.children[i], key);
    }

    void insert(int key) {
        BTreeNode current = root;

        if (current.count == 2 * degree - 1) {
            BTreeNode newRoot = new BTreeNode(degree, false);
            newRoot.children[0] = root;
            splitChild(newRoot, 0);
            root = newRoot;
        }

        insertNonFull(root, key);
    }

    void insertNonFull(BTreeNode node, int key) {
        int i = node.count - 1;

        if (node.leaf) {
            while (i >= 0 && key < node.keys[i]) {
                node.keys[i + 1] = node.keys[i];
                i--;
            }

            node.keys[i + 1] = key;
            node.count++;
        } else {
            while (i >= 0 && key < node.keys[i]) {
                i--;
            }

            i++;

            if (node.children[i].count == 2 * degree - 1) {
                splitChild(node, i);

                if (key > node.keys[i]) {
                    i++;
                }
            }

            insertNonFull(node.children[i], key);
        }
    }

    void splitChild(BTreeNode parent, int index) {
        BTreeNode full = parent.children[index];
        BTreeNode newNode = new BTreeNode(degree, full.leaf);

        newNode.count = degree - 1;

        for (int j = 0; j < degree - 1; j++) {
            newNode.keys[j] = full.keys[j + degree];
        }

        if (!full.leaf) {
            for (int j = 0; j < degree; j++) {
                newNode.children[j] = full.children[j + degree];
            }
        }

        full.count = degree - 1;

        for (int j = parent.count; j >= index + 1; j--) {
            parent.children[j + 1] = parent.children[j];
        }

        parent.children[index + 1] = newNode;

        for (int j = parent.count - 1; j >= index; j--) {
            parent.keys[j + 1] = parent.keys[j];
        }

        parent.keys[index] = full.keys[degree - 1];
        parent.count++;
    }
}

class BPlusTree {
    List<Integer> keys = new ArrayList<>();

    void insert(int key) {
        if (!keys.contains(key)) {
            keys.add(key);
            keys.sort(Integer::compareTo);
        }
    }

    boolean search(int key) {
        return keys.contains(key);
    }

    void traverse() {
        for (int key : keys) {
            System.out.print(key + " ");
        }
        System.out.println();
    }
}

public class BTreeAndBPlusTree {
    public static void main(String[] args) {
        BTree bTree = new BTree(2);

        int[] values = {10, 20, 30, 40, 50, 60, 70};

        for (int value : values) {
            bTree.insert(value);
        }

        System.out.println("B Tree:");
        bTree.traverse(bTree.root);

        System.out.println("\nSearch 30: " +
            (bTree.search(bTree.root, 30) ? "Found" : "Not Found"));

        BPlusTree bPlusTree = new BPlusTree();

        for (int value : values) {
            bPlusTree.insert(value);
        }

        System.out.println("\nB+ Tree:");
        bPlusTree.traverse();

        System.out.println("Search 40: " +
            (bPlusTree.search(40) ? "Found" : "Not Found"));
    }
}
