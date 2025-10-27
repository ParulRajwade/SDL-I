//Compare two strings without using equals()
public class pg30 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        boolean isEqual = (s1.compareTo(s2) == 0);
        System.out.println(isEqual ? "Strings are equal" : "Strings are not equal");
    }
}

