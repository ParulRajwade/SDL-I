abstract class Animal {
    abstract void sound();  // abstract method
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class pg20AbstractExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}

