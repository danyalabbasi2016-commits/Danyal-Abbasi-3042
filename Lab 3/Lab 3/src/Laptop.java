
public class Laptop extends Computer {
    private double length;  // in inches
    private double width;   // in inches
    private double height;  // in inches
    private double weight;  // in pounds

    // Default constructor
    public Laptop() {
        super(); // Call parent default constructor
        this.length = 0.0;
        this.width = 0.0;
        this.height = 0.0;
        this.weight = 0.0;
    }

    // Parameterized constructor for all components
    public Laptop(int wordSize, int memorySize, int storageSize, double speed,
                  double length, double width, double height, double weight) {
        super(wordSize, memorySize, storageSize, speed); // Call parent constructor
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    // Display method (overrides parent's display)
    public void display() {
        super.display(); // Call parent's display method first
        System.out.println("=== LAPTOP DIMENSIONS ===");
        System.out.println("Length: " + length + " inches");
        System.out.println("Width: " + width + " inches");
        System.out.println("Height: " + height + " inches");
        System.out.println("Weight: " + weight + " pounds");
    }

    // Getter and setter methods for Laptop-specific attributes
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}