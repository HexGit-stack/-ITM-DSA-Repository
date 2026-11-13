/*
 * Topic: Sparse Matrices
 * Description: Converts a normal matrix into
 * triplet representation by storing non-zero elements.
 */

public class SparseMatrix {

    public static void main(String[] args) {

        
        int[][] matrix = {
            {0, 0, 3},
            {0, 4, 0},
            {5, 0, 0}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        int count = 0;

        // Count non-zero elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != 0) {
                    count++;
                }
            }
        }

        // Create sparse matrix
        int[][] sparse = new int[count + 1][3];

       
        sparse[0][0] = rows;
        sparse[0][1] = columns;
        sparse[0][2] = count;

        int k = 1;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (matrix[i][j] != 0) {

                    sparse[k][0] = i;
                    sparse[k][1] = j;
                    sparse[k][2] = matrix[i][j];

                    k++;
                }
            }
        }

       
        System.out.println("Original Matrix:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

       
        System.out.println("\nSparse Matrix (Triplet Representation):");
        System.out.println("Row  Column  Value");

        for (int i = 0; i <= count; i++) {
            System.out.println(
                sparse[i][0] + "    " +
                sparse[i][1] + "       " +
                sparse[i][2]
            );
        }
    }
}
