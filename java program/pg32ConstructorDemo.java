public class pg32ConstructorDemo {
    int x;

    // Default constructor
    pg32ConstructorDemo() {
        x = 10;
    }

    // Parameterized constructor
    pg32ConstructorDemo(int val) {
        x = val;
    }

    // Copy constructor
    pg32ConstructorDemo(pg32ConstructorDemo obj) {
        x = obj.x;
    }

    void display() {
        System.out.println("Value of x = " + x);
    }

    public static void main(String[] args) {
        pg32ConstructorDemo obj1 = new pg32ConstructorDemo();
        pg32ConstructorDemo obj2 = new pg32ConstructorDemo(20);
        pg32ConstructorDemo obj3 = new pg32ConstructorDemo(obj2);

        obj1.display();
        obj2.display();
        obj3.display();
    }
}

