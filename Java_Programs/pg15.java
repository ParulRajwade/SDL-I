//Using Interface
interface Printable {
    void print();
}
class A implements Printable {
    public void print() {
        System.out.println("Hello from Interface Implementation");
    }
}
class pg15 {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
    }
}
