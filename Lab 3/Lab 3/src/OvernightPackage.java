// OvernightPackage.java
public class OvernightPackage extends Package {
    private double additionalFeePerOunce; // additional fee per ounce for overnight delivery

    // Constructor
    public OvernightPackage(String senderName, String senderAddress, String senderCity,
                            String senderState, String senderZip,
                            String recipientName, String recipientAddress, String recipientCity,
                            String recipientState, String recipientZip,
                            double weight, double costPerOunce, double additionalFeePerOunce) {

        super(senderName, senderAddress, senderCity, senderState, senderZip,
                recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
                weight, costPerOunce);

        // Validate and set additional fee per ounce
        if (additionalFeePerOunce > 0) {
            this.additionalFeePerOunce = additionalFeePerOunce;
        } else {
            this.additionalFeePerOunce = 0;
            System.out.println("Warning: Additional fee per ounce must be positive. Set to 0.");
        }
    }

    // Override calculateCost to include additional fee per ounce
    @Override
    public double calculateCost() {
        // Calculate with increased cost per ounce
        return getWeight() * (getCostPerOunce() + additionalFeePerOunce);
    }

    // Override displayInfo to show overnight package details
    @Override
    public void displayInfo() {
        System.out.println("\n=== OVERNIGHT PACKAGE INFORMATION ===");
        System.out.println("Sender: " + getSenderName());
        System.out.println("From: " + getSenderAddress() + ", " + getSenderCity() + ", " +
                getSenderState() + " " + getSenderZip());
        System.out.println("Recipient: " + getRecipientName());
        System.out.println("To: " + getRecipientAddress() + ", " + getRecipientCity() + ", " +
                getRecipientState() + " " + getRecipientZip());
        System.out.println("Weight: " + getWeight() + " ounces");
        System.out.println("Base cost per ounce: $" + String.format("%.2f", getCostPerOunce()));
        System.out.println("Additional fee per ounce: $" + String.format("%.2f", additionalFeePerOunce));
        System.out.println("Effective cost per ounce: $" +
                String.format("%.2f", getCostPerOunce() + additionalFeePerOunce));
        System.out.println("Delivery Type: Overnight Delivery");
        System.out.println("Total Cost: $" + String.format("%.2f", calculateCost()));
    }

    // Getter and setter for additional fee per ounce
    public double getAdditionalFeePerOunce() {
        return additionalFeePerOunce;
    }

    public void setAdditionalFeePerOunce(double additionalFeePerOunce) {
        if (additionalFeePerOunce > 0) {
            this.additionalFeePerOunce = additionalFeePerOunce;
        } else {
            System.out.println("Error: Additional fee per ounce must be positive.");
        }
    }
}