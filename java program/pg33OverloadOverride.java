class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) { // Overloading
        return a + b + c;
    }
}

class AdvancedMath extends MathOperation {
    @Override
    int add(int a, int b) { // Overriding
        return (a + b) * 2;
    }
}

public class pg33OverloadOverride {
    public static void main(String[] args) {
        MathOperation obj1 = new MathOperation();
        AdvancedMath obj2 = new AdvancedMath();

        System.out.println("Overloading (3 args): " + obj1.add(2, 3, 4));
        System.out.println("Overriding: " + obj2.add(2, 3));
    }
}

