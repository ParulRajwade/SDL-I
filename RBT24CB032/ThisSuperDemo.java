class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void display() {
        System.out.println("Using this: " + this.name);
        System.out.println("Using super: " + super.name);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}
