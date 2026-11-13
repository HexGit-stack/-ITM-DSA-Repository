# 10 – Two-Way (Doubly) Linked List

## Definition

A Doubly Linked List is a linear data structure in which each node contains three parts: data, a reference to the previous node and a reference to the next node.

It allows traversal in both forward and backward directions.

## Structure of a Node

Each node contains:
- Data: Stores the value.
- Previous: Points to the previous node.
- Next: Points to the next node.

## Operations Covered

1. Creation of nodes.
2. Insertion of elements.
3. Deletion of elements.
4. Forward traversal.
5. Backward traversal.

## Java Program

**File:**DoublyLinkedList.java

This program demonstrates insertion, deletion and traversal in both directions.

## Sample Output

Forward Traversal:
10 20 30 40

Backward Traversal:
40 30 20 10

After Deletion:
10 20 40


## Time Complexity

| Operation | Complexity |
|---|---|
| Forward Traversal | O(n) |
| Backward Traversal | O(n) |
| Insertion at beginning | O(1) |
| Deletion at beginning | O(1) |
| Searching | O(n) |

## Programming Language
Java

---

Part of the ITM DSA Repository.
