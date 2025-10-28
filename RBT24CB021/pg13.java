//Sort an Array
class pg13 {
    public static void main(String[] args) {
        int a[] = {5, 3, 1, 4, 2};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }
}
