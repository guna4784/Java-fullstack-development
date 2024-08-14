class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Student other) {
        return this.name.equals(other.name) && this.age == other.age;
    }
}

public class CompareObj {
    public static void main(String[] args) {
        Student s1 = new Student("John", 20);
        Student s2 = new Student("John", 20);

        if (s1.equals(s2))
            System.out.println(" students are equal.");
        else
            System.out.println("Students are not equal.");
    }
}
