
public class Electricity {
    protected String consumerName;
    protected int unitsConsumed;

    public Electricity() {
        consumerName = "";
        unitsConsumed = 0;
    }

    public Electricity(String consumerName, int unitsConsumed) {
        this.consumerName = consumerName;
        this.unitsConsumed = unitsConsumed;
    }

    // Method to calculate bill
    public double Bill() {
        double totalCost = 0;

        if (unitsConsumed <= 100) {
            totalCost = unitsConsumed * 0.50; // 50 paise per unit
        } else {
            totalCost = (100 * 0.50) + ((unitsConsumed - 100) * 0.60); // 60 paise per unit beyond 100
        }

        return totalCost;
    }

    // Method to display bill details
    public void displayBill() {
        double billAmount = Bill();
        System.out.println("Consumer Name: " + consumerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + String.format("%.2f", billAmount));
    }

    // Getters and setters
    public String getConsumerName() {
        return consumerName;
    }

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

    public void setUnitsConsumed(int unitsConsumed) {
        this.unitsConsumed = unitsConsumed;
    }
}