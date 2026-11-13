/*
 * Topic: Multidimensional Arrays
 * Description: Demonstrates 2D array traversal
 * and addition of two matrices.
 */

public class MatrixOperations {

    public static void main(String[] args) {

       
        int[][] matrix1 = {
            {1, 2},
            {3, 4}
        };

       
        int[][] matrix2 = {
            {5, 6},
            {7, 8}
        };

        int[][] sum = new int[2][2];

        
        System.out.println("First Matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        
        System.out.println("\nSecond Matrix:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        
        System.out.println("\nSum of Matrices:");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
