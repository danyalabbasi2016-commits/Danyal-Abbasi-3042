
import java.util.Scanner;

public class Tape extends Publication {
    private double playingTime; // in minutes

    // Method to get data from user (overrides parent's method)
    public void getdata() {
        super.getdata(); // Call parent's getdata() first

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter playing time (in minutes): ");
        this.playingTime = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
    }

    // Method to display data (overrides parent's method)
    public void putdata() {
        System.out.println("\n=== AUDIO CASSETTE DETAILS ===");
        super.putdata(); // Call parent's putdata() first
        System.out.println("Playing Time: " + playingTime + " minutes");
    }

    // Getter and setter for playingTime
    public double getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(double playingTime) {
        this.playingTime = playingTime;
    }
}