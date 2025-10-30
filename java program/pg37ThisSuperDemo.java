class Parent {
    String name = "Parent";
}

class Child extends Parent {
    String name = "Child";

    void show() {
        System.out.println("Using this: " + this.name);
        System.out.println("Using super: " + super.name);
    }
}

public class pg37ThisSuperDemo {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}

