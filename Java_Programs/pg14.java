//Static Variable and Method
class pg14 {
    static int count = 0;
    static void displayCount() {
        System.out.println("Count = " + count);
    }
    public static void main(String[] args) {
        count = 5;
        displayCount();
    }
}
