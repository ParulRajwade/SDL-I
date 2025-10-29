//Using try, catch, finally
public class pg40 {
    public static void main(String[] args) {
        try {
            int a = 5 / 0;
        } catch (Exception e) {
            System.out.println("Error: " + e);
        } finally {
            System.out.println("Finally block always executes.");
        }
    }
}
