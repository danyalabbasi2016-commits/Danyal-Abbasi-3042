
import java.util.Scanner;

public class Test extends Student2 {
    private double t1, t2, t3;
    private double s1, s2, assignment;
    private double finalMarks;

    public Test() {
        super();
        t1 = t2 = t3 = 0;
        s1 = s2 = assignment = 0;
        finalMarks = 0;
    }

    public void getmarks() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Test 1 (20): ");
        t1 = scanner.nextDouble();
        System.out.print("Test 2 (20): ");
        t2 = scanner.nextDouble();
        System.out.print("Test 3 (20): ");
        t3 = scanner.nextDouble();
        System.out.print("Sessional 1 (10): ");
        s1 = scanner.nextDouble();
        System.out.print("Sessional 2 (10): ");
        s2 = scanner.nextDouble();
        System.out.print("Assignment (20): ");
        assignment = scanner.nextDouble();
    }

    public void putmarks() {
        System.out.println("Test 1: " + t1);
        System.out.println("Test 2: " + t2);
        System.out.println("Test 3: " + t3);
        System.out.println("Sessional 1: " + s1);
        System.out.println("Sessional 2: " + s2);
        System.out.println("Assignment: " + assignment);
        System.out.println("Final: " + finalMarks);
    }

    public void Finalresult() {
        // Simple calculation: average of all components
        double total = t1 + t2 + t3 + s1 + s2 + assignment;
        finalMarks = (total / 100) * 100; // Convert to percentage
    }

    public void displayAll() {
        System.out.println("\n=== RESULT ===");
        putdata();
        putmarks();
    }
}