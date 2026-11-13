public class Hashing {
    static final int SIZE = 7;
    static final int DELETED = -1;

    int[] table;

    Hashing() {
        table = new int[SIZE];
    }

    int hashFunction(int key) {
        return key % SIZE;
    }

    void insert(int key) {
        int index = hashFunction(key);

        for (int i = 0; i < SIZE; i++) {
            int position = (index + i) % SIZE;

            if (table[position] == 0 || table[position] == DELETED) {
                table[position] = key;
                return;
            }
        }

        System.out.println("Hash Table is Full");
    }

    boolean search(int key) {
        int index = hashFunction(key);

        for (int i = 0; i < SIZE; i++) {
            int position = (index + i) % SIZE;

            if (table[position] == 0) {
                return false;
            }

            if (table[position] == key) {
                return true;
            }
        }

        return false;
    }

    void delete(int key) {
        int index = hashFunction(key);

        for (int i = 0; i < SIZE; i++) {
            int position = (index + i) % SIZE;

            if (table[position] == 0) {
                return;
            }

            if (table[position] == key) {
                table[position] = DELETED;
                return;
            }
        }
    }

    void display() {
        for (int i = 0; i < SIZE; i++) {
            System.out.print("Index " + i + ": ");

            if (table[i] == 0) {
                System.out.println("Empty");
            } else if (table[i] == DELETED) {
                System.out.println("Deleted");
            } else {
                System.out.println(table[i]);
            }
        }
    }

    public static void main(String[] args) {
        Hashing hash = new Hashing();

        hash.insert(16);
        hash.insert(23);
        hash.insert(12);
        hash.insert(21);

        System.out.println("Hash Table using Linear Probing:");
        hash.display();

        System.out.println("\nSearch 23: " +
            (hash.search(23) ? "Found" : "Not Found"));

        hash.delete(23);

        System.out.println("\nAfter deleting 23:");
        System.out.println("Search 23: " +
            (hash.search(23) ? "Found" : "Not Found"));
    }
}
