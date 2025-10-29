//Using this Keyword
class pg18 {
    int a;
    pg18(int a) {
        this.a = a;
    }
    void show() {
        System.out.println("Value of a: " + a);
    }
    public static void main(String[] args) {
        pg18 obj = new pg18(10);
        obj.show();
    }
}
