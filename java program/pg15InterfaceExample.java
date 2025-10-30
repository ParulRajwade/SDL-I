interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class pg15InterfaceExample {
    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();
        c.sound();
    }
}

