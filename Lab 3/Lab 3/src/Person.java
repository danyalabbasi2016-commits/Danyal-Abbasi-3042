
public class Person {
    private String name;
    private Address address;

    // Default constructor
    public Person() {
        this.name = "";
        this.address = new Address();
    }

    // Parameterized constructor
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Parameterized constructor with address details
    public Person(String name, String street, String houseNumber, String city, String postalCode) {
        this.name = name;
        this.address = new Address(street, houseNumber, city, postalCode);
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // Method to set address using individual components
    public void setAddress(String street, String houseNumber, String city, String postalCode) {
        this.address.setStreet(street);
        this.address.setHouseNumber(houseNumber);
        this.address.setCity(city);
        this.address.setPostalCode(postalCode);
    }

    // Method to display person information
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address.toString();
    }
}