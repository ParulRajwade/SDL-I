public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println("StringBuffer: " + sbf);

        StringBuilder sbd = new StringBuilder("Java");
        sbd.append(" Program");
        System.out.println("StringBuilder: " + sbd);
    }
}

