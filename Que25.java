class Person{
    protected String name;
    protected int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    protected void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}
class Student extends Person {
    private int studentID;
    Student(String name, int age, int studentID) {
        super(name, age);
        this.studentID = studentID;
    }
    void displayStudentInfo() {
        displayInfo();
        System.out.println("Student ID: " + studentID);
    }
}
public class Que25{
    public static void main(String[] args) {
        Student student = new Student("Alice", 20, 12345);
        student.displayStudentInfo();
    }
}
 