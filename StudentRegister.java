import java.util.Scanner;

// Class representing a Student
class Student {
    private String name;
    private int rollNumber;
    private String course;
    private double gpa;

    // Constructor to initialize student details
    public Student(String name, int rollNumber, String course, double gpa) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
        this.gpa = gpa;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("\n--- Registered Student Details ---");
        System.out.println("Name        : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Course      : " + course);
        System.out.println("GPA         : " + gpa);
        System.out.println("----------------------------------");
    }
}

// Main class to handle the student register
public class StudentRegister {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== Student Registration System =====");
        
        // Collecting input details
        System.out.print("Enter Student Full Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("Enter Course/Major: ");
        String course = scanner.nextLine();

        System.out.print("Enter Current GPA: ");
        double gpa = scanner.nextDouble();

        // Object creation
        Student student = new Student(name, rollNumber, course, gpa);

        // Display results
        student.displayStudentDetails();

        scanner.close();
    }
}