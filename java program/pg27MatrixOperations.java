public class pg27MatrixOperations {
    public static void main(String[] args) {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] b = {{5, 6}, {7, 8}};
        int[][] sum = new int[2][2];
        int[][] diff = new int[2][2];
        int[][] prod = new int[2][2];

        // Addition and Subtraction
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                sum[i][j] = a[i][j] + b[i][j];
                diff[i][j] = a[i][j] - b[i][j];
            }
        }

        // Multiplication
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                prod[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    prod[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("Matrix Addition:");
        printMatrix(sum);

        System.out.println("Matrix Subtraction:");
        printMatrix(diff);

        System.out.println("Matrix Multiplication:");
        printMatrix(prod);
    }

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}

