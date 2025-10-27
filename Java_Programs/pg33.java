//Demonstrate method overloading and overriding
class Parent {
    void display() {
        System.out.println("Parent display()");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("Child display()");
    }

    void display(int n) {  // Overloading
        System.out.println("Child display() with number: " + n);
    }
}

public class pg33 {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.display();
        obj.display(10);
    }
}
