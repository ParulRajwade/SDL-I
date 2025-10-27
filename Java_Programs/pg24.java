//Sort Array (Ascending & Descending
class pg24 {
    public static void main(String[] args) {
        int a[] = {3, 1, 4, 2};
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int t = a[i]; a[i] = a[j]; a[j] = t;
                }
            }
        }
        System.out.println("Ascending:");
        for (int i = 0; i < a.length; i++) System.out.print(a[i] + " ");
        System.out.println("\nDescending:");
        for (int i = a.length - 1; i >= 0; i--) System.out.print(a[i] + " ");
    }
}
