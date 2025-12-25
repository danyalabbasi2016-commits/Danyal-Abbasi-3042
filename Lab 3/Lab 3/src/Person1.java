
import java.util.Scanner;

public class Person1 {
    private String id;
    private String name;
    private String address;

    // Constructor
    public Person1() {
        id = "";
        name = "";
        address = "";
    }

    // Parameterized constructor
    public Person1(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Input method
    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter ID: ");
        this.id = scanner.nextLine();
        System.out.print("Enter Name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter Address: ");
        this.address = scanner.nextLine();
    }

    // Display method
    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}