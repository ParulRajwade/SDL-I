class Student {
    String name;
    int roll;

    Student(String name, int roll) {
        this.name = name;  // refers to current object
        this.roll = roll;
    }

    void show() {
        System.out.println("Name: " + name + ", Roll: " + roll);
    }
}

public class pg18ThisExample {
    public static void main(String[] args) {
        Student s = new Student("Amit", 25);
        s.show();
    }
}

