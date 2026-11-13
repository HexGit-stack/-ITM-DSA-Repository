# Binary Search Trees (BST)

## Definition
A Binary Search Tree is a special type of binary tree in which each node follows a specific ordering rule:
- Values smaller than the node are stored in the left subtree.
- Values greater than the node are stored in the right subtree.
- Both subtrees also follow the same rule.

## Basic Operations
- Insertion: Adds a new node to the BST.
- Searching: Finds a particular value.
- Deletion: Removes a node from the BST.
- Traversal: Visits all nodes in a specific order.

## Types of Deletion
1. Leaf Node: Remove the node directly.
2. One Child: Replace the node with its child.
3. Two Children: Replace the node with its inorder successor.

## Java Program
BinarySearchTree.java

## Sample Output

Inorder Traversal: 20 30 40 50 60 70 80
Search 40: Found
After deleting 30:
20 40 50 60 70 80


## Time Complexity

| Operation | Average Case | Worst Case |
|---|---|---|
| Insertion | O(log n) | O(n) |
| Searching | O(log n) | O(n) |
| Deletion | O(log n) | O(n) |
| Traversal | O(n) | O(n) |

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
