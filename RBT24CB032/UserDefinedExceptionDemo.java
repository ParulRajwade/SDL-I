class InvalidMarksException extends Exception {
    InvalidMarksException(String msg) {
        super(msg);
    }
}

public class UserDefinedExceptionDemo {
    static void validateMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100)
            throw new InvalidMarksException("Invalid Marks Entered!");
        else
            System.out.println("Marks are valid.");
    }

    public static void main(String[] args) {
        try {
            validateMarks(120);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}

