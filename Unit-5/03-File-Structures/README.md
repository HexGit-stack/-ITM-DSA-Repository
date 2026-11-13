# File Structures

## Definition
File Structure refers to the way data is organized, stored and accessed in files. It helps manage information efficiently for reading, writing, searching and updating.

## Types of File Structures

### 1. Sequential File Organization
Records are stored one after another and are accessed sequentially.

### 2. Random Access Files
Allow data to be accessed directly at a specific position without reading all previous records.

### 3. Indexed Sequential Files
Combine sequential storage with an index that helps locate records quickly.

## Basic Operations
- Create a file
- Write data
- Read data
- Access records randomly
- Search for records

## Java Program
FileStructures.java

## Sample Output

Sequential File:
101 Anish
102 Rahul
103 Priya

Random Access:
Record at position 2:
102 Rahul

Indexed Sequential Search:
Record found: 103 Priya


## Time Complexity
| Operation | Time Complexity |
|---|---|
| Sequential Search | O(n) |
| Random Access | O(1) for fixed-length records |
| Indexed Search | O(log n) with a suitable index |

## Language
Java

## Difficulty
Intermediate

---
Part of the ITM DSA Repository.
