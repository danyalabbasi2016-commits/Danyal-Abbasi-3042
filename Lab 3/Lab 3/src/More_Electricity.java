
public class More_Electricity extends Electricity {

    public More_Electricity() {
        super();
    }

    public More_Electricity(String consumerName, int unitsConsumed) {
        super(consumerName, unitsConsumed);
    }

    // Override Bill method to add surcharge
    @Override
    public double Bill() {
        // First calculate basic bill using parent class method
        double basicBill = super.Bill();
        double finalBill = basicBill;

        // Add 15% surcharge if bill exceeds Rs. 250
        if (basicBill > 250.00) {
            double surcharge = (basicBill - 250.00) * 0.15;
            finalBill = basicBill + surcharge;
            System.out.println("Surcharge applied: Rs. " + String.format("%.2f", surcharge));
        }

        return finalBill;
    }

    // Override displayBill to show detailed breakdown
    @Override
    public void displayBill() {
        double basicBill = super.Bill(); // Get basic bill without surcharge
        double finalBill = Bill(); // Get final bill with surcharge

        System.out.println("\n=== ELECTRICITY BILL DETAILS ===");
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Basic Bill Amount: Rs. " + String.format("%.2f", basicBill));

        if (basicBill > 250.00) {
            double surcharge = finalBill - basicBill;
            System.out.println("Surcharge (15% on excess over Rs. 250): Rs. " + String.format("%.2f", surcharge));
        }

        System.out.println("Final Bill Amount: Rs. " + String.format("%.2f", finalBill));
        System.out.println("================================");
    }

    // Method to show rate structure
    public void showRateStructure() {
        System.out.println("\nRate Structure:");
        System.out.println("First 100 units: Rs. 0.50 per unit");
        System.out.println("Beyond 100 units: Rs. 0.60 per unit");
        System.out.println("Surcharge: 15% on amount exceeding Rs. 250.00");
    }
}