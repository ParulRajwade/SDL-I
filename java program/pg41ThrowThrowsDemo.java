class AgeCheck {
    static void validate(int age) throws ArithmeticException {
        if (age < 18)
            throw new ArithmeticException("Not eligible to vote");
        else
            System.out.println("Eligible to vote");
    }
}

public class pg41ThrowThrowsDemo {
    public static void main(String[] args) {
        try {
            AgeCheck.validate(16);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

