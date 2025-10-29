import java.util.Arrays;

public class SearchArray {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 2};
        int key = 5;

        // Linear Search
        boolean found = false;
        for (int num : arr) {
            if (num == key) {
                found = true;
                break;
            }
        }
        System.out.println("Linear Search: " + (found ? "Found" : "Not Found"));

        // Binary Search
        Arrays.sort(arr);
        int result = Arrays.binarySearch(arr, key);
        System.out.println("Binary Search: " + (result >= 0 ? "Found" : "Not Found"));
    }
}

