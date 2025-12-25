
public class Address {
    private String street;
    private String houseNumber;
    private String city;
    private String postalCode;

    // Default constructor
    public Address() {
        this.street = "";
        this.houseNumber = "";
        this.city = "";
        this.postalCode = "";
    }

    // Parameterized constructor
    public Address(String street, String houseNumber, String city, String postalCode) {
        this.street = street;
        this.houseNumber = houseNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    // Getter methods
    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    // Setter methods
    public void setStreet(String street) {
        this.street = street;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    // Method to display address information
    @Override
    public String toString() {
        return houseNumber + " " + street + ", " + city + " " + postalCode;
    }
}