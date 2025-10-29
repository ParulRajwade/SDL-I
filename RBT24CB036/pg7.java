//Simple Calculator using switch...case
public class pg7 {
    public static void main(String[] args) {
        char operator = '+';
        int a = 10, b = 5;
        int result;

        switch (operator) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default: System.out.println("Invalid operator!"); return;
        }
        System.out.println("Result: " + result);
    }
}
