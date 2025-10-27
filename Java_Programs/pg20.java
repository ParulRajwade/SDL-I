//Abstract Class
abstract class Shape {
    abstract void draw();
}
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class pg20
 {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.draw();
    }
}
