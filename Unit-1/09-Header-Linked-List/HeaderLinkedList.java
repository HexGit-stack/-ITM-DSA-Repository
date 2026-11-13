public class HeaderLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node header;

    HeaderLinkedList() {
        header = new Node(0);
    }

    void insert(int data) {
        Node newNode = new Node(data);

        Node temp = header;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    void display() {
        Node temp = header.next;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        HeaderLinkedList list = new HeaderLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Header Linked List:");
        list.display();
    }
}
