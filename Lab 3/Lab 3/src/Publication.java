
import java.util.Scanner;

public class Publication {
    private String title;
    private double price;

    // Method to get data from user
    public void getdata() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter title: ");
        this.title = scanner.nextLine();

        System.out.print("Enter price: $");
        this.price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
    }

    // Method to display data
    public void putdata() {
        System.out.println("Title: " + title);
        System.out.println("Price: $" + price);
    }

    // Getter methods (for extensibility)
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // Setter methods (for extensibility)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}