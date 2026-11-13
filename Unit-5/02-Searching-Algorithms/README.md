# Searching Algorithms

## Definition
Searching is the process of finding a specific element in a collection of data.

## Types of Searching

### 1. Linear Search
Linear Search checks each element one by one until the required element is found or the list ends.

### 2. Binary Search
Binary Search repeatedly divides a sorted array into two halves to find the required element.

## Key Differences
- Linear Search works on sorted and unsorted arrays.
- Binary Search requires a sorted array.
- Binary Search is generally faster for large sorted datasets.

## Java Program
SearchingAlgorithms.java

## Sample Output

Array: 10 20 30 40 50 60 70

Linear Search:
Element 40 found at index 3

Binary Search:
Element 60 found at index 5


## Time Complexity

| Algorithm | Best Case | Average Case | Worst Case |
|---|---|---|---|
| Linear Search | O(1) | O(n) | O(n) |
| Binary Search | O(1) | O(log n) | O(log n) |

## Language
Java

## Difficulty
Beginner

---
Part of the ITM DSA Repository.
