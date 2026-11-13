# Deque (Double-Ended Queue)

## Definition
A Deque (Double-Ended Queue) is a linear data structure in which insertion and deletion can be performed from both the front and rear ends.

## Types of Deque
1. **Input-Restricted Deque:** Insertion is allowed at only one end, but deletion is allowed at both ends.
2. **Output-Restricted Deque:** Deletion is allowed at only one end, but insertion is allowed at both ends.

## Basic Operations
- Insert Front: Adds an element at the front.
- Insert Rear: Adds an element at the rear.
- Delete Front: Removes an element from the front.
- Delete Rear: Removes an element from the rear.
- Display: Shows all elements.

## Java Program
DequeImplementation.java

## Sample Output

Deque:
10 20 30
After inserting 5 at front:
5 10 20 30
After inserting 40 at rear:
5 10 20 30 40
After deleting front:
10 20 30 40
After deleting rear:
10 20 30


## Time Complexity

| Operation | Time Complexity |
|---|---|
| Insert Front | O(1) |
| Insert Rear | O(1) |
| Delete Front | O(1) |
| Delete Rear | O(1) |
| Display | O(n) |

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
