// Parent class
class parent {
    int x = 100; // variable in parent class
}

// Child class
class Child extends parent {
    int x = 200; // variable in child class (same name as parent)

    void display() {
        // 'super.x' refers to the parent class variable
        System.out.println("parent x: " + super.x);

        // 'x' (without super) refers to the child class variable
        System.out.println("Child x: " + x);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.display(); // method call
    }
}