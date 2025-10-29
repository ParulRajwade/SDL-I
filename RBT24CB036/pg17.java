//Class and Object
class Student {
    int roll;
    String name;
    void input(int r, String n) {
        roll = r;
        name = n;
    }
    void display() {
        System.out.println("Roll: " + roll + " Name: " + name);
    }
}
class pg17 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.input(1, "Renuka");
        s1.display();
    }
}
