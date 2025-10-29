class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    @Override
    int add(int a, int b) {
        System.out.println("Overridden method called");
        return super.add(a, b);
    }
}

public class OverloadOverrideDemo {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("Sum: " + c1.add(5, 10));
        System.out.println("Sum: " + c1.add(5.5, 2.5));

        AdvancedCalculator c2 = new AdvancedCalculator();
        System.out.println("Sum: " + c2.add(7, 3));
    }
}

