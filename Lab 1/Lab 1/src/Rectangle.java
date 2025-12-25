public class Rectangle {
    private double width;
    private double height;

    // No-arg constructor (default rectangle)
    public Rectangle() {
        this.width = 1.0;
        this.height = 1.0;
    }

    // Constructor with specified width and height
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Method to get area
    public double getArea() {
        return width * height;
    }

    // Method to get perimeter
    public double getPerimeter() {
        return 2 * (width + height);
    }

    // Getters and setters (optional but useful)
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

    // toString method for easy display
    @Override
    public String toString() {
        return String.format("Rectangle[width=%.2f, height=%.2f]", width, height);
    }
}