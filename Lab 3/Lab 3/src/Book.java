
import java.util.Scanner;

public class Book extends Publication {
    private int pageCount;

    // Method to get data from user (overrides parent's method)
    public void getdata() {
        super.getdata(); // Call parent's getdata() first

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter page count: ");
        this.pageCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
    }

    // Method to display data (overrides parent's method)
    public void putdata() {
        System.out.println("\n=== BOOK DETAILS ===");
        super.putdata(); // Call parent's putdata() first
        System.out.println("Page Count: " + pageCount);
    }

    // Getter and setter for pageCount
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}