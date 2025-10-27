//Search Element (Linear & Binary)
class pg25
 {
    public static void main(String[] args) {
        int a[] = {1, 3, 5, 7, 9};
        int key = 7;
        boolean found = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                found = true;
                break;
            }
        }
        if (found)
            System.out.println("Element found (Linear Search)");
        else
            System.out.println("Element not found");

        // Binary Search
        int low = 0, high = a.length - 1, mid;
        found = false;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] == key) { found = true; break; }
            else if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        if (found) System.out.println("Element found (Binary Search)");
    }
}
