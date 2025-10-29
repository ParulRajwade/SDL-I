public class StaticExample {
    static int count = 0;

    static void increment() {
        count++;
        System.out.println("Count = " + count);
    }

    public static void main(String[] args) {
        increment();
        increment();
    }
}

