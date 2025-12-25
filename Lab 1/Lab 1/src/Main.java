import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // ================= Lab Task No 1 =================
        System.out.println("Creating objects...");
        CounterClass obj1 = new CounterClass();
        CounterClass obj2 = new CounterClass();
        CounterClass obj3 = new CounterClass();




        // ================= Lab Task No 2 =================
        System.out.println("\nTotal objects created: " + CounterClass.getTotalObjects());
        // ================= Lab Task No 3 =================
        Int myInt = new Int();

        System.out.println("Testing Int class:");

        // Initialize to zero and display
        myInt.initToZero();
        System.out.print("After initToZero(): ");
        myInt.display();

        // Initialize to a value and display
        myInt.initToValue(42);
        System.out.print("After initToValue(42): ");
        myInt.display();

        // Initialize to another value and display
        myInt.initToValue(100);
        System.out.print("After initToValue(100): ");
        myInt.display();
        // ================= Lab Task No 4 =================
        Time time = new Time();
        time.enterTime();
        time.display24();
        time.display12();
        // ================= Lab Task No 5 =================
        Marks studentMarks = new Marks();
        studentMarks.set_marks(85, 90, 78);

        System.out.println("Marks set: 85, 90, 78");
        System.out.println("Sum: " + studentMarks.sum());
        System.out.println("Average: " + studentMarks.avg());
        System.out.println();
        // ================= Home Task No 1 =================

        // Create first rectangle: width=4, height=40
        Rectangle rect1 = new Rectangle(4, 40);

        // Create second rectangle: width=3.5, height=35.9
        Rectangle rect2 = new Rectangle(3.5, 35.9);

        System.out.println("=== Rectangle 1 ===");
        System.out.printf("Width: %.2f%n", rect1.getWidth());
        System.out.printf("Height: %.2f%n", rect1.getHeight());
        System.out.printf("Area: %.2f%n", rect1.getArea());
        System.out.printf("Perimeter: %.2f%n", rect1.getPerimeter());

        System.out.println("\n=== Rectangle 2 ===");
        System.out.printf("Width: %.2f%n", rect2.getWidth());
        System.out.printf("Height: %.2f%n", rect2.getHeight());
        System.out.printf("Area: %.2f%n", rect2.getArea());
        System.out.printf("Perimeter: %.2f%n", rect2.getPerimeter());

        // Test default constructor
        System.out.println("\n=== Default Rectangle ===");
        Rectangle defaultRect = new Rectangle();
        System.out.println(defaultRect);  // Calls toString()
        System.out.printf("Area: %.2f%n", defaultRect.getArea());
        System.out.printf("Perimeter: %.2f%n", defaultRect.getPerimeter());
        // ================= Home Task No 2 =================
// Create Stock object with symbol ORCL and name Oracle Corporation
        Stock oracleStock = new Stock("ORCL", "Oracle Corporation");

        // Set previous closing price to 34.5
        oracleStock.setPreviousClosingPrice(34.5);

        // Set current price to 34.35
        oracleStock.setCurrentPrice(34.35);

        // Display the price-change percentage
        System.out.println("Stock: " + oracleStock.getName() + " (" + oracleStock.getSymbol() + ")");
        System.out.println("Previous Closing Price: $" + oracleStock.getPreviousClosingPrice());
        System.out.println("Current Price: $" + oracleStock.getCurrentPrice());
        System.out.printf("Price Change Percentage: %.2f%%\n", oracleStock.getChangePercent());

        // Additional test
        System.out.println("\n--- Additional Test ---");
        Stock appleStock = new Stock("AAPL", "Apple Inc.");
        appleStock.setPreviousClosingPrice(150.0);
        appleStock.setCurrentPrice(155.5);
        System.out.println("Stock: " + appleStock.getName() + " (" + appleStock.getSymbol() + ")");
        System.out.printf("Price Change: %.2f%%\n", appleStock.getChangePercent());
        // ================= Home Task No 3 =================
        System.out.println("Check in Date file");
        // ================= Home Task No 4 =================
        System.out.println("Check in RandomNumber file");
        // ================= Home Task No 5 =================
// Create Account object with ID 1122, balance $20,000
        Account account = new Account(1122, 20000);

        // Set annual interest rate to 4.5%
        account.setAnnualInterestRate(4.5);

        System.out.println("=== Account Details ===");
        System.out.println("Account ID: " + account.getId());
        System.out.printf("Initial Balance: $%.2f%n", account.getBalance());
        System.out.printf("Annual Interest Rate: %.1f%%%n", account.getAnnualInterestRate());
        System.out.println("Date Created: " + account.getDateCreated());

        // Withdraw $2,500
        account.withdraw(2500);
        System.out.printf("\nAfter withdrawing $2,500: $%.2f%n", account.getBalance());

        // Deposit $3,000
        account.deposit(3000);
        System.out.printf("After depositing $3,000: $%.2f%n", account.getBalance());

        // Display final information
        System.out.println("\n=== Final Account Status ===");
        System.out.printf("Balance: $%.2f%n", account.getBalance());
        System.out.printf("Monthly Interest: $%.2f%n", account.getMonthlyInterest());
        System.out.println("Account Created: " + account.getDateCreated());
    }
}
