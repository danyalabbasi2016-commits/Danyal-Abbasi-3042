
public class Date {
    private int day;
    private int month;
    private int year;

    // Default constructor
    public Date() {
        this.day = 1;
        this.month = 1;
        this.year = 2000;
    }

    // Parameterized constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter methods
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // Setter methods
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day! Day should be between 1 and 31.");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month! Month should be between 1 and 12.");
        }
    }

    public void setYear(int year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Invalid year! Year should be positive.");
        }
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}