import java.util.Scanner;

public class Time {
    int h, m, s;

    void enterTime() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hour: ");
        h = scan.nextInt();
        System.out.print("Minute: ");
        m = scan.nextInt();
        System.out.print("Second: ");
        s = scan.nextInt();
    }

    void display24() {
        System.out.println("24 Format: " + h + ":" + m + ":" + s);
    }

    void display12() {
        String t = (h >= 12) ? "PM" : "AM";
        int hour12 = h % 12;
        if (hour12 == 0) hour12 = 12;
        System.out.println("12 Format: " + hour12 + ":" + m + ":" + s + " " + t);
    }
}

