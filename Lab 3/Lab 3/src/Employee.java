
public class Employee {
    private String name;
    private String employeeId;
    private Date dateOfJoining;
    private Date dateOfBirth;

    // Default constructor
    public Employee() {
        this.name = "";
        this.employeeId = "";
        this.dateOfJoining = new Date();
        this.dateOfBirth = new Date();
    }

    // Parameterized constructor
    public Employee(String name, String employeeId, Date dateOfJoining, Date dateOfBirth) {
        this.name = name;
        this.employeeId = employeeId;
        this.dateOfJoining = dateOfJoining;
        this.dateOfBirth = dateOfBirth;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Date getDateOfJoining() {
        return dateOfJoining;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    // Method to check if employee joined within last 5 years (current year is 2012)
    public boolean joinedWithinLastFiveYears() {
        final int CURRENT_YEAR = 2012;
        int joiningYear = dateOfJoining.getYear();
        return (CURRENT_YEAR - joiningYear) <= 5;
    }

    // Method to check if employee age is less than 40 years
    public boolean isAgeLessThanForty() {
        final int CURRENT_YEAR = 2012;
        int birthYear = dateOfBirth.getYear();
        int age = CURRENT_YEAR - birthYear;

        // If birthday hasn't occurred yet this year, subtract 1 from age
        int currentMonth = 12; // Assuming December 2012
        int currentDay = 31;   // Assuming 31st December 2012

        if (dateOfBirth.getMonth() > currentMonth ||
                (dateOfBirth.getMonth() == currentMonth && dateOfBirth.getDay() > currentDay)) {
            age--;
        }

        return age < 40;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
                "\nName: " + name +
                "\nDate of Birth: " + dateOfBirth +
                "\nDate of Joining: " + dateOfJoining;
    }
}