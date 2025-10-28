//Matrix Addition, Subtraction & Multiplication
class pg27 {
    public static void main(String[] args) {
        int a[][] = {{1, 2}, {3, 4}};
        int b[][] = {{5, 6}, {7, 8}};
        int c[][] = new int[2][2];

        // Addition
        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        // Multiplication
        System.out.println("Multiplication:");
        int mul[][] = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++)
                    mul[i][j] += a[i][k] * b[k][j];
                System.out.print(mul[i][j] + " ");
            }
            System.out.println();
        }
    }
}

