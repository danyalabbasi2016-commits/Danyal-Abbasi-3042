
public class TwoDayPackage extends Package {
    private double flatFee; // additional flat fee for two-day delivery

    // Constructor
    public TwoDayPackage(String senderName, String senderAddress, String senderCity,
                         String senderState, String senderZip,
                         String recipientName, String recipientAddress, String recipientCity,
                         String recipientState, String recipientZip,
                         double weight, double costPerOunce, double flatFee) {

        super(senderName, senderAddress, senderCity, senderState, senderZip,
                recipientName, recipientAddress, recipientCity, recipientState, recipientZip,
                weight, costPerOunce);

        // Validate and set flat fee
        if (flatFee > 0) {
            this.flatFee = flatFee;
        } else {
            this.flatFee = 0;
            System.out.println("Warning: Flat fee must be positive. Set to 0.");
        }
    }

    // Override calculateCost to include flat fee
    @Override
    public double calculateCost() {
        return super.calculateCost() + flatFee;
    }

    // Override displayInfo to show two-day package details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Delivery Type: Two-Day Delivery");
        System.out.println("Flat Fee: $" + String.format("%.2f", flatFee));
        System.out.println("Total Cost (with flat fee): $" + String.format("%.2f", calculateCost()));
    }

    // Getter and setter for flat fee
    public double getFlatFee() {
        return flatFee;
    }

    public void setFlatFee(double flatFee) {
        if (flatFee > 0) {
            this.flatFee = flatFee;
        } else {
            System.out.println("Error: Flat fee must be positive.");
        }
    }
}