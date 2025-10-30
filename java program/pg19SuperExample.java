class Parent {
    void message() {
        System.out.println("This is parent class.");
    }
}

class Child extends Parent {
    void message() {
        super.message(); // calls parent class method
        System.out.println("This is child class.");
    }
}

public class pg19SuperExample {
    public static void main(String[] args) {
        Child c = new Child();
        c.message();
    }
}

