import java.util.PriorityQueue;
import java.util.Comparator;

class Task {
    String name;
    int priority;

    Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String toString() {
        return name + " (Priority: " + priority + ")";
    }
}

public class PriorityQueue {
    public static void main(String[] args) {
        java.util.PriorityQueue<Task> queue =
            new java.util.PriorityQueue<>(
                Comparator.comparingInt(task -> task.priority)
            );

        queue.add(new Task("Task A", 3));
        queue.add(new Task("Task B", 1));
        queue.add(new Task("Task C", 2));

        System.out.println("Priority Queue:");

        for (Task task : queue.stream()
                .sorted(Comparator.comparingInt(t -> t.priority))
                .toList()) {
            System.out.println(task);
        }

        System.out.println("\nRemoved: " + queue.poll());

        System.out.println("\nAfter Removal:");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
