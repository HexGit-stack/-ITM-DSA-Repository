class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList {
    Node head;
    Node tail;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }

    void delete(int value) {
        if (head == null) {
            return;
        }

        Node current = head;
        Node previous = tail;

        do {
            if (current.data == value) {
                if (current == head && current == tail) {
                    head = null;
                    tail = null;
                } else {
                    previous.next = current.next;

                    if (current == head) {
                        head = current.next;
                    }

                    if (current == tail) {
                        tail = previous;
                    }

                    tail.next = head;
                }

                return;
            }

            previous = current;
            current = current.next;

        } while (current != head);
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        do {
            System.out.print(current.data + " ");
            current = current.next;
        } while (current != head);

        System.out.println();
    }

    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Circular Linked List:");
        list.display();

        list.delete(20);

        System.out.println("After deleting 20:");
        list.display();
    }
}
