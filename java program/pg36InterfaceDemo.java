interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with a key");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with a kick");
    }
}

public class pg36InterfaceDemo {
    public static void main(String[] args) {
        Vehicle c = new Car();
        Vehicle b = new Bike();

        c.start();
        b.start();
    }
}

