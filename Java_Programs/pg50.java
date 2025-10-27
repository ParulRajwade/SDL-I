//Demonstrate StringBuffer & StringBuilder
public class pg50 {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);

        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" Programming");
        System.out.println("StringBuilder: " + sbd);
    }
}
