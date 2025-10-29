public class ThrowThrowsDemo {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}

