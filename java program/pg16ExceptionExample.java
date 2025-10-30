public class pg16ExceptionExample {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b; // may cause exception
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed.");
        }
    }
}


