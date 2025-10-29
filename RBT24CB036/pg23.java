//largest and Smallest in Array
class pg23 {
    public static void main(String[] args) {
        int a[] = {5, 2, 9, 1, 6};
        int max = a[0], min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
