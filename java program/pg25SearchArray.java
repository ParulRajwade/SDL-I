import java.util.Arrays;
import java.util.Scanner;

public class pg25SearchArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        // Linear search
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println("Element found using Linear Search.");
        else
            System.out.println("Element not found.");

        // Binary search
        int index = Arrays.binarySearch(arr, key);
        if (index >= 0)
            System.out.println("Element found at index " + index + " using Binary Search.");
        else
            System.out.println("Element not found in Binary Search.");
    }
}

