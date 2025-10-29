import java.util.Arrays;

public class ConcatenateArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] c = new int[a.length + b.length];

        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);

        System.out.println("Concatenated Array: " + Arrays.toString(c));
    }
}

