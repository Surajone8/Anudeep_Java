class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;

    public Address(String street, String city, String state, String zipCode) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip Code: " + zipCode);
    }
}

public class AddressTest {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Springfield", "IL", "62701");
        address.displayAddress();
    }
}

/* Output:
   Street: 123 Main St
   City: Springfield
   State: IL
   Zip Code: 62701
   */
