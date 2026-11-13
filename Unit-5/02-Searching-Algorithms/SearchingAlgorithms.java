public class SearchingAlgorithms {

    static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(int[] arr, int key) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        System.out.print("Array: ");
        for (int value : arr) {
            System.out.print(value + " ");
        }

        int linearResult = linearSearch(arr, 40);

        System.out.println("\n\nLinear Search:");
        if (linearResult != -1) {
            System.out.println("Element 40 found at index " + linearResult);
        } else {
            System.out.println("Element not found");
        }

        int binaryResult = binarySearch(arr, 60);

        System.out.println("\nBinary Search:");
        if (binaryResult != -1) {
            System.out.println("Element 60 found at index " + binaryResult);
        } else {
            System.out.println("Element not found");
        }
    }
}
