class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class BinarySearchTree {

    Node root;

    Node insert(Node root, int value) {
        if (root == null) {
            return new Node(value);
        }

        if (value < root.data) {
            root.left = insert(root.left, value);
        } else if (value > root.data) {
            root.right = insert(root.right, value);
        }

        return root;
    }

    boolean search(Node root, int value) {
        if (root == null) {
            return false;
        }

        if (root.data == value) {
            return true;
        }

        if (value < root.data) {
            return search(root.left, value);
        }

        return search(root.right, value);
    }

    Node findMinimum(Node root) {
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    Node delete(Node root, int value) {
        if (root == null) {
            return null;
        }

        if (value < root.data) {
            root.left = delete(root.left, value);
        } else if (value > root.data) {
            root.right = delete(root.right, value);
        } else {
            if (root.left == null) {
                return root.right;
            }

            if (root.right == null) {
                return root.left;
            }

            Node successor = findMinimum(root.right);
            root.data = successor.data;
            root.right = delete(root.right, successor.data);
        }

        return root;
    }

    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        int[] values = {50, 30, 70, 20, 40, 60, 80};

        for (int value : values) {
            tree.root = tree.insert(tree.root, value);
        }

        System.out.print("Inorder Traversal: ");
        tree.inorder(tree.root);

        System.out.println();
        System.out.println("Search 40: " +
                (tree.search(tree.root, 40) ? "Found" : "Not Found"));

        tree.root = tree.delete(tree.root, 30);

        System.out.println("After deleting 30:");
        tree.inorder(tree.root);
    }
}
