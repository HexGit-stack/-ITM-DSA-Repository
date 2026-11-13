/*
 * Topic: Operations on Linear Arrays
 * Description: Demonstrates traversal, insertion,
 * deletion, searching and updating in an array.
 */

public class ArrayOperations {

    public static void display(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = new int[10];

        int size = 5;

      
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

       
        System.out.print("Original Array: ");
        display(arr, size);

        
        int position = 2;
        int value = 25;

        for (int i = size; i > position; i--) {
            arr[i] = arr[i - 1];
        }

        arr[position] = value;
        size++;

        System.out.print("After Insertion: ");
        display(arr, size);

        
        position = 2;

        for (int i = position; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;

        System.out.print("After Deletion: ");
        display(arr, size);

        // 4. Searching
        int key = 40;
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Element " + key +
                    " found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        // 5. Updating
        arr[3] = 99;

        System.out.print("After Updating: ");
        display(arr, size);
    }
}
