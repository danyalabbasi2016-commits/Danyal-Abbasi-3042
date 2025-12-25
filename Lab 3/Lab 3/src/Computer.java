
public class Computer {
    private int wordSize;      // in bits
    private int memorySize;    // in megabytes
    private int storageSize;   // in megabytes
    private double speed;      // in megahertz

    // Default constructor
    public Computer() {
        this.wordSize = 0;
        this.memorySize = 0;
        this.storageSize = 0;
        this.speed = 0.0;
    }

    // Parameterized constructor
    public Computer(int wordSize, int memorySize, int storageSize, double speed) {
        this.wordSize = wordSize;
        this.memorySize = memorySize;
        this.storageSize = storageSize;
        this.speed = speed;
    }

    // Display method
    public void display() {
        System.out.println("=== COMPUTER SPECIFICATIONS ===");
        System.out.println("Word Size: " + wordSize + " bits");
        System.out.println("Memory Size: " + memorySize + " MB");
        System.out.println("Storage Size: " + storageSize + " MB");
        System.out.println("Speed: " + speed + " MHz");
    }

    // Getter and setter methods
    public int getWordSize() {
        return wordSize;
    }

    public void setWordSize(int wordSize) {
        this.wordSize = wordSize;
    }

    public int getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(int memorySize) {
        this.memorySize = memorySize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}