# B Trees and B+ Trees

## Definition

### B Tree
A B Tree is a self-balancing search tree in which each node can contain multiple keys and have multiple children. It keeps data sorted and supports efficient searching, insertion and deletion.

### B+ Tree
A B+ Tree is an advanced version of a B Tree in which actual records are stored in leaf nodes. Internal nodes contain only keys used for navigation. Leaf nodes are usually linked to support efficient sequential access.

## Key Differences

| B Tree | B+ Tree |
|---|---|
| Records can be stored in internal and leaf nodes. | Records are stored in leaf nodes. |
| Leaf nodes are not necessarily linked. | Leaf nodes are linked. |
| Searching may finish at an internal node. | Searching always reaches a leaf node. |
| Sequential access is less efficient. | Sequential access is more efficient. |

## Basic Operations
- Searching
- Insertion
- Deletion
- Traversal

## Java Program
BTreeAndBPlusTree.java

## Sample Output

B Tree:
10 20 30 40 50 60 70

Search 30: Found

B+ Tree:
10 20 30 40 50 60 70

Search 40: Found


## Time Complexity

| Operation | Average Time Complexity |
|---|---|
| Searching | O(log n) |
| Insertion | O(log n) |
| Deletion | O(log n) |
| Traversal | O(n) |

## Language
Java

## Difficulty
Intermediate

---
Part of the ITM DSA Repository.
