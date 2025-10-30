import java.util.Arrays;

public class pg24SortAscendingDescending {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 7, 1};
        Arrays.sort(arr);

        System.out.println("Ascending Order:");
        for (int i : arr)
            System.out.print(i + " ");

        System.out.println("\nDescending Order:");
        for (int i = arr.length - 1; i >= 0; i--)
            System.out.print(arr[i] + " ");
    }
}

