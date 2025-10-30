public class pg23LargestSmallestArray {
    public static void main(String[] args) {
        int[] arr = {25, 11, 7, 75, 56};
        int largest = arr[0];
        int smallest = arr[0];

        for (int num : arr) {
            if (num > largest)
                largest = num;
            if (num < smallest)
                smallest = num;
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}

