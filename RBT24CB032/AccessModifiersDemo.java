class Demo {
    public int a = 10;
    private int b = 20;
    protected int c = 30;
    int d = 40; // default

    void show() {
        System.out.println("Public: " + a);
        System.out.println("Private: " + b);
        System.out.println("Protected: " + c);
        System.out.println("Default: " + d);
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.show();
    }
}
