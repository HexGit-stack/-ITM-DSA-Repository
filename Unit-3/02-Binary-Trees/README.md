# Binary Trees

## Definition
A Binary Tree is a non-linear data structure in which each node can have at most two children, known as the left child and right child.

## Key Concepts
- **Representation:** Binary trees can be represented using linked nodes or arrays.
- **Traversal:** Visiting all nodes using Inorder, Preorder and Postorder methods.
- **Extended Binary Tree:** A binary tree in which null child links are replaced with special external nodes.
- **Threaded Binary Tree:** A binary tree that uses otherwise-null pointers to connect nodes to their traversal predecessor or successor.
- **Operations:** Insertion, searching, deletion and traversal.

## Types of Traversal
1. Inorder: Left → Root → Right
2. Preorder: Root → Left → Right
3. Postorder: Left → Right → Root

## Java Program
BinaryTree.java

## Sample Output

Inorder Traversal: 40 20 50 10 60 30
Preorder Traversal: 10 20 40 50 30 60
Postorder Traversal: 40 50 20 60 30 10
Total Nodes: 6


## Time Complexity

| Operation | Time Complexity |
|---|---|
| Traversal | O(n) |
| Searching | O(n) |
| Insertion | O(n) in a general binary tree |

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
