public class pg30CompareStrings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        boolean isEqual = true;

        if (str1.length() != str2.length())
            isEqual = false;
        else {
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    isEqual = false;
                    break;
                }
            }
        }

        if (isEqual)
            System.out.println("Strings are equal");
        else
            System.out.println("Strings are not equal");
    }
}

