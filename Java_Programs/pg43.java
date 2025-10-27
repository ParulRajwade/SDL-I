//Demonstrate public, private, protected, default access modifiers
class AccessModifiers {
    public int pub = 1;
    private int pri = 2;
    protected int pro = 3;
    int def = 4;

    void display() {
        System.out.println("Public: " + pub);
        System.out.println("Private: " + pri);
        System.out.println("Protected: " + pro);
        System.out.println("Default: " + def);
    }
}

public class pg43 {
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        obj.display();
    }
}
