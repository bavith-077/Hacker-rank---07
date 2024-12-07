import java.util.Scanner;

public class bubble {

    // Bubble sort method to sort an array
    static void bubbleSort(int[] array) {
        int n = array.length;
        
        // Outer loop for the number of passes
        for (int i = 0; i < n - 1; i++) {
            // Inner loop for pairwise comparisons
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if the current element is greater than the next element
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Main method to test the bubble sort
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        // Input: array elements
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sort the array
        bubbleSort(array);

        // Output: sorted array
        System.out.println("Sorted array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
