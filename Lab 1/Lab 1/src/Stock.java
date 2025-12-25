public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    // Constructor that creates a stock with specified symbol and name
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    // Method to get percentage change
    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    // Getter and setter for previousClosingPrice
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    // Getter and setter for currentPrice
    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Getter for symbol
    public String getSymbol() {
        return symbol;
    }

    // Getter for name
    public String getName() {
        return name;
    }
}