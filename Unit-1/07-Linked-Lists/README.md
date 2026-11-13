# 07 – Linked Lists

## Definition

A Linked List is a linear data structure in which elements are stored in nodes. Each node contains data and a reference to the next node.

Unlike arrays, linked lists do not require continuous memory locations.

## Structure of a Node

Each node contains:
- Data: Stores the value.
- Next: Stores the reference to the next node.

## Operations on Linked Lists

1. Creation – Creating nodes.
2. Insertion – Adding a new node.
3. Deletion – Removing a node.
4. Searching – Finding a particular element.
5. Traversal – Displaying all nodes.

## Java Program

**File:LinkedList.java

This program demonstrates the creation and basic operations of a singly linked list.

## Sample Output
Linked List:
10 20 30 40

After Insertion:
10 20 25 30 40

After Deletion:
10 20 30 40

Searching for 30:
Element found


## Time Complexity

| Operation | Complexity |
|---|---|
| Traversal | O(n) |
| Insertion at beginning | O(1) |
| Deletion at beginning | O(1) |
| Searching | O(n) |

## Programming Language
Java

---

Part of the ITM DSA Repository.
