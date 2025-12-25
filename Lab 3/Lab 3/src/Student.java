// Student.java
import java.util.Scanner;

public class Student extends Person1 {
    private String rollNumber;
    private double marks;

    // Constructor
    public Student() {
        super(); // Call parent constructor
        rollNumber = "";
        marks = 0.0;
    }

    // Parameterized constructor
    public Student(String id, String name, String address, String rollNumber, double marks) {
        super(id, name, address); // Call parent constructor
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Input method (overrides parent's input)
    public void input() {
        super.input(); // Call parent's input method first
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        this.rollNumber = scanner.nextLine();
        System.out.print("Enter Marks: ");
        this.marks = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
    }

    // Display method (overrides parent's display)
    public void display() {
        System.out.println("\n=== STUDENT DETAILS ===");
        super.display(); // Call parent's display method first
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
    }

    // Getters and setters for Student-specific attributes
    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
}