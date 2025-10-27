//Using super Keyword
class pg19 {
    int x = 100;
}
class Child extends pg19 {
    int x = 200;
    void display() {
        System.out.println("parent x: " + super.x);
        System.out.println("Child x: " + x);
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }

}