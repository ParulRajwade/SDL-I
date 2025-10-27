// Exception Handling
class pg16 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int c = a / b;  // This line will throw ArithmeticException
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
    }
}
