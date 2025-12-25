import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        // Create Random object with seed 1000
        Random random = new Random(1000);

        System.out.println("First 50 random integers between 0 and 100 (seed=1000):");
        System.out.println("========================================================");

        // Display first 50 random integers between 0 and 100
        for (int i = 1; i <= 50; i++) {
            int randomNumber = random.nextInt(100);
            System.out.printf("%3d ", randomNumber);

            // Print 10 numbers per line
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}