// No import statement needed when using fully qualified name

public class Date {
    public static void main(String[] args) {
        // Use java.util.Date (fully qualified name)
        java.util.Date date = new java.util.Date();

        // Array of elapsed times in milliseconds
        long[] elapsedTimes = {
                10000L,        // 10 seconds
                100000L,       // 100 seconds
                1000000L,      // ~16.7 minutes
                10000000L,     // ~2.78 hours
                100000000L,    // ~1.16 days
                1000000000L,   // ~11.57 days
                10000000000L,  // ~115.74 days
                100000000000L  // ~1157.4 days (~3.17 years)
        };

        System.out.println("Displaying dates for different elapsed times:\n");

        // Set elapsed time for each value and display
        for (int i = 0; i < elapsedTimes.length; i++) {
            // Set elapsed time since epoch (Jan 1, 1970)
            date.setTime(elapsedTimes[i]);

            // Display the date using toString() method
            System.out.println("Elapsed time: " + elapsedTimes[i] + " milliseconds");
            System.out.println("Date: " + date.toString());
            System.out.println();
        }

        // Show current date for comparison
        System.out.println("=== For Comparison ===");
        java.util.Date currentDate = new java.util.Date();
        System.out.println("Current date/time: " + currentDate.toString());
        System.out.println("Current time in milliseconds since epoch: " + currentDate.getTime());
    }
}