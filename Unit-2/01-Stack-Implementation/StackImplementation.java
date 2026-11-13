class ArrayStack {
    int[] stack;
    int top;
    int capacity;

    ArrayStack(int size) {
        capacity = size;
        stack = new int[size];
        top = -1;
    }

    void push(int value) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        stack[++top] = value;
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + stack[top--]);
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + stack[top]);
        }
    }

    void display() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

class LinkedListStack {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node top;

    void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Popped: " + top.data);
        top = top.next;
    }

    void peek() {
        if (top == null) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + top.data);
        }
    }

    void display() {
        Node current = top;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }
}

public class StackImplementation {
    public static void main(String[] args) {
        ArrayStack arrayStack = new ArrayStack(5);

        System.out.println("Array Stack:");
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        arrayStack.display();
        arrayStack.pop();
        arrayStack.peek();

        LinkedListStack linkedStack = new LinkedListStack();

        System.out.println("\nLinked List Stack:");
        linkedStack.push(10);
        linkedStack.push(20);
        linkedStack.push(30);
        linkedStack.display();
        linkedStack.pop();
        linkedStack.peek();
    }
}
