class Student {
    String name;
    int roll;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
    }
}

public class pg17ClassObjectExample {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Riya";
        s1.roll = 10;
        s1.display();
    }
}

