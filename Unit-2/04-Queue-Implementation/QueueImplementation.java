class ArrayQueue {
    int[] queue;
    int front;
    int rear;
    int capacity;

    ArrayQueue(int size) {
        capacity = size;
        queue = new int[size];
        front = 0;
        rear = -1;
    }

    void enqueue(int value) {
        if (rear == capacity - 1) {
            System.out.println("Queue Overflow");
            return;
        }

        queue[++rear] = value;
    }

    void dequeue() {
        if (front > rear) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Dequeued: " + queue[front]);
        front++;
    }

    void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }

    void display() {
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

class LinkedListQueue {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node front;
    Node rear;

    void enqueue(int value) {
        Node newNode = new Node(value);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Dequeued: " + front.data);
        front = front.next;

        if (front == null) {
            rear = null;
        }
    }

    void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + front.data);
        }
    }

    void display() {
        Node current = front;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class QueueImplementation {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue(5);

        System.out.println("Array Queue:");
        arrayQueue.enqueue(10);
        arrayQueue.enqueue(20);
        arrayQueue.enqueue(30);
        arrayQueue.display();
        arrayQueue.dequeue();
        arrayQueue.peek();

        LinkedListQueue linkedQueue = new LinkedListQueue();

        System.out.println("\nLinked List Queue:");
        linkedQueue.enqueue(10);
        linkedQueue.enqueue(20);
        linkedQueue.enqueue(30);
        linkedQueue.display();
        linkedQueue.dequeue();
        linkedQueue.peek();
    }
}
