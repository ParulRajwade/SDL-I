abstract class Shape {
    abstract void draw();
    void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.display();
        s.draw();
    }
}

