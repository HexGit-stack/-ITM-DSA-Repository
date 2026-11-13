# Priority Queue

## Definition
A Priority Queue is a special type of queue in which each element is assigned a priority. Elements are removed according to their priority rather than their insertion order.

In this implementation, a smaller priority number represents a higher priority.

## Key Features
- Each element has an associated priority.
- Higher-priority elements are removed first.
- Elements with equal priority are processed in insertion order.
- It can be implemented using arrays, linked lists, or heaps.

## Basic Operations
- Insert: Adds an element with a priority.
- Remove: Removes the highest-priority element.
- Peek: Displays the highest-priority element.
- Display: Shows all elements according to priority.

## Java Program
`PriorityQueue.java`

## Sample Output

Priority Queue:
Task B (Priority: 1)
Task C (Priority: 2)
Task A (Priority: 3)

Removed: Task B

After Removal:
Task C (Priority: 2)
Task A (Priority: 3)


## Time Complexity

| Operation | Time Complexity |
|---|---|
| Insert | O(log n) |
| Remove | O(log n) |
| Peek | O(1) |

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
