/*
 * Topic: Linear Arrays
 * Description: Demonstration of array declaration,
 * initialization, accessing and displaying elements.
 */

public class LinearArray {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Elements of Linear Array:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Index " + i + ": " + arr[i]);
        }
    }
}
