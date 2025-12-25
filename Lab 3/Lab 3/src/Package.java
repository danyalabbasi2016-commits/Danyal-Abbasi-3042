
public class Package {
    // Sender information
    private String senderName;
    private String senderAddress;
    private String senderCity;
    private String senderState;
    private String senderZip;

    // Recipient information
    private String recipientName;
    private String recipientAddress;
    private String recipientCity;
    private String recipientState;
    private String recipientZip;

    // Package details
    private double weight; // in ounces
    private double costPerOunce; // cost per ounce

    // Constructor
    public Package(String senderName, String senderAddress, String senderCity,
                   String senderState, String senderZip,
                   String recipientName, String recipientAddress, String recipientCity,
                   String recipientState, String recipientZip,
                   double weight, double costPerOunce) {

        // Validate and set sender information
        this.senderName = senderName;
        this.senderAddress = senderAddress;
        this.senderCity = senderCity;
        this.senderState = senderState;
        this.senderZip = senderZip;

        // Validate and set recipient information
        this.recipientName = recipientName;
        this.recipientAddress = recipientAddress;
        this.recipientCity = recipientCity;
        this.recipientState = recipientState;
        this.recipientZip = recipientZip;

        // Validate and set package details
        if (weight > 0) {
            this.weight = weight;
        } else {
            this.weight = 0;
            System.out.println("Warning: Weight must be positive. Set to 0.");
        }

        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else {
            this.costPerOunce = 0;
            System.out.println("Warning: Cost per ounce must be positive. Set to 0.");
        }
    }

    // Calculate shipping cost
    public double calculateCost() {
        return weight * costPerOunce;
    }

    // Display package information
    public void displayInfo() {
        System.out.println("\n=== PACKAGE INFORMATION ===");
        System.out.println("Sender: " + senderName);
        System.out.println("From: " + senderAddress + ", " + senderCity + ", " + senderState + " " + senderZip);
        System.out.println("Recipient: " + recipientName);
        System.out.println("To: " + recipientAddress + ", " + recipientCity + ", " + recipientState + " " + recipientZip);
        System.out.println("Weight: " + weight + " ounces");
        System.out.println("Cost per ounce: $" + String.format("%.2f", costPerOunce));
        System.out.println("Base shipping cost: $" + String.format("%.2f", calculateCost()));
    }

    // Getter methods
    public String getSenderName() { return senderName; }
    public String getSenderAddress() { return senderAddress; }
    public String getSenderCity() { return senderCity; }
    public String getSenderState() { return senderState; }
    public String getSenderZip() { return senderZip; }

    public String getRecipientName() { return recipientName; }
    public String getRecipientAddress() { return recipientAddress; }
    public String getRecipientCity() { return recipientCity; }
    public String getRecipientState() { return recipientState; }
    public String getRecipientZip() { return recipientZip; }

    public double getWeight() { return weight; }
    public double getCostPerOunce() { return costPerOunce; }

    // Setter methods with validation
    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Error: Weight must be positive.");
        }
    }

    public void setCostPerOunce(double costPerOunce) {
        if (costPerOunce > 0) {
            this.costPerOunce = costPerOunce;
        } else {
            System.out.println("Error: Cost per ounce must be positive.");
        }
    }
}