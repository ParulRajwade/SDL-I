public class MatrixOperations {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};

        int[][] sum = new int[2][2];
        int[][] diff = new int[2][2];
        int[][] prod = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                diff[i][j] = a[i][j] - b[i][j];
                prod[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }

        System.out.println("Addition:");
        print(sum);
        System.out.println("Subtraction:");
        print(diff);
        System.out.println("Multiplication:");
        print(prod);
    }

    static void print(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

