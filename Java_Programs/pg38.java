//Demonstrate static variables and methods
public class pg38 {
    static int count = 0;

    pg38() {
        count++;
    }

    static void showCount() {
        System.out.println("Object count: " + count);
    }

    public static void main(String[] args) {
        new pg38();
        new pg38();
        pg38.showCount();
    }
}
