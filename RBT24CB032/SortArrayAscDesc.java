import java.util.Arrays;

public class SortArrayAscDesc {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));

        System.out.print("Descending: [");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i == 0 ? "]" : ", "));
        }
    }
}
