import java.util.ArrayDeque;

public class DequeImplementation {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.addLast(10);
        deque.addLast(20);
        deque.addLast(30);

        System.out.println("Deque:");
        System.out.println(deque);

        deque.addFirst(5);

        System.out.println("After inserting 5 at front:");
        System.out.println(deque);

        deque.addLast(40);

        System.out.println("After inserting 40 at rear:");
        System.out.println(deque);

        deque.removeFirst();

        System.out.println("After deleting front:");
        System.out.println(deque);

        deque.removeLast();

        System.out.println("After deleting rear:");
        System.out.println(deque);
    }
}
