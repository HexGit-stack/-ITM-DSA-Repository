# Hashing

## Definition
Hashing is a technique used to convert a key into an index using a hashing function. It allows efficient insertion, searching and deletion of data in a hash table.

## Key Concepts

### 1. Hash Table
A data structure that stores data using key-value pairs.

### 2. Hashing Function
A function that converts a key into an index in the hash table.

Example:
`hash(key) = key % tableSize`

### 3. Collision
A collision occurs when two different keys generate the same hash index.

## Collision Resolution Strategies

1. **Linear Probing:** Searches the next available position sequentially.
2. **Quadratic Probing:** Searches positions using quadratic intervals.
3. **Chaining:** Stores multiple elements at the same index using a linked list.

## Basic Operations
- Insert: Adds an element to the hash table.
- Search: Finds an element.
- Delete: Removes an element.
- Display: Shows the hash table.

## Java Program
Hashing.java

## Sample Output

Hash Table using Linear Probing:
Index 0: Empty
Index 1: 21
Index 2: 12
Index 3: 23
Index 4:  Empty
Index 5: Empty
Index 6: 16

Search 23: Found
After deleting 23:
Search 23: Not Found


## Time Complexity

| Operation | Average Case | Worst Case |
|---|---|---|
| Insertion | O(1) | O(n) |
| Searching | O(1) | O(n) |
| Deletion | O(1) | O(n) |

## Language
Java

## Difficulty
Intermediate

---
Part of the ITM DSA Repository.
