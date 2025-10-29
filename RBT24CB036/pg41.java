//Using throw and throws
public class pg41 {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        checkAge(15);
    }
}
