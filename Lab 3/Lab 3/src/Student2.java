
import java.util.Scanner;

public class Student2 {
    private int rollNo;
    private String name;
    private String className;

    public Student2() {
        rollNo = 0;
        name = "";
        className = "";
    }

    public void getdata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Roll No: ");
        rollNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Name: ");
        name = scanner.nextLine();
        System.out.print("Class: ");
        className = scanner.nextLine();
    }

    public void putdata() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + className);
    }
}