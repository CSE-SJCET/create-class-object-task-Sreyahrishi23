// TODO: Create a class called Student with name, rollNumber, and grade
class Student {
    String name;
    int rollNumber;
    char grade;

    // TODO: Create a method to display student details
    Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
    }

    void displayDetails() {
        System.out.println("Student name: " + name);
        System.out.println("Student rollNumber: " + rollNumber);
        System.out.println("Student grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Student object and call the method to display details
        Student student = new Student("Sreya", 70, 'A');
        student.displayDetails();
    }
}
