public class CompareStrings {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        boolean equal = (s1.length() == s2.length());

        for (int i = 0; i < s1.length() && equal; i++) {
            if (s1.charAt(i) != s2.charAt(i))
                equal = false;
        }

        System.out.println(equal ? "Strings are equal" : "Strings are not equal");
    }
}
