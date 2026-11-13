# 05 – Sparse Matrices

## Definition
A Sparse Matrix is a matrix in which most of the elements are zero.
Instead of storing every element, we can store only the non-zero elements along with their row and column positions. This helps save memory.

## Important Terms

- **Row:** Horizontal arrangement of elements.
- **Column:** Vertical arrangement of elements.
- **Non-zero Element:** An element whose value is not zero.
- **Triplet Representation:** A method of storing a sparse matrix using three columns: row, column and value.

## Java Program
File:SparseMatrix.java

This program converts a normal matrix into a sparse matrix using triplet representation.

The first row of the triplet representation stores:
- Total number of rows.
- Total number of columns.
- Total number of non-zero elements.

The remaining rows store the row index, column index and value of each non-zero element.

## Sample Output
Original Matrix:
0 0 3
0 4 0
5 0 0

Sparse Matrix (Triplet Representation):
Row  Column  Value
3    3       3
0    2       3
1    1       4
2    0       5


## Advantages

- Saves memory.
- Efficient storage of matrices containing mostly zeros.
- Useful in scientific computing and graph applications.

## Time Complexity

- Matrix traversal: O(rows × columns)
- Sparse representation: O(rows × columns)

## Programming Language
Java

---

Part of the ITM DSA Repository.
