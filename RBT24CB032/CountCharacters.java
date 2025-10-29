public class CountCharacters {
    public static void main(String[] args) {
        String str = "Java 123 is fun!";
        int v = 0, c = 0, d = 0, s = 0;
        str = str.toLowerCase();

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z')
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            else if (ch >= '0' && ch <= '9') d++;
            else if (ch == ' ') s++;
        }

        System.out.println("Vowels: " + v + ", Consonants: " + c + ", Digits: " + d + ", Spaces: " + s);
    }
}

