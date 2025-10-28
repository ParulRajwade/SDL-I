//Demonstrate constructors (default, parameterized, copy)
public class pg32 {
    int x;

    pg32() {
        x = 10;
    }

    pg32(int val) {
        x = val;
    }

    pg32(pg32 obj) {
        x = obj.x;
    }

    public static void main(String[] args) {
        pg32 a = new pg32();
        pg32 b = new pg32(50);
        pg32 c = new pg32(b);

        System.out.println("Default: " + a.x);
        System.out.println("Parameterized: " + b.x);
        System.out.println("Copy: " + c.x);
    }
}
