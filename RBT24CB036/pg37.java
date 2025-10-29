//Demonstrate this and super keyword
class SuperClass {
    int num = 20;
}

class SubClass extends SuperClass {
    int num = 10;

    void show() {
        System.out.println("This num: " + this.num);
        System.out.println("Super num: " + super.num);
    }
}

public class pg37 {
    public static void main(String[] args) {
        SubClass obj = new SubClass();
        obj.show();
    }
}
