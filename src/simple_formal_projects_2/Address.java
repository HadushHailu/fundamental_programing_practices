package simple_formal_projects_2;

public class Address {
    protected String street;
    protected String city;
    protected String state;
    protected String zip;

    /*
     * Default constructor with zero argument
     */
    Address(){}

    Address(String street, String city, String state, String zip){
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public static void main(String[] args) {
    }
}
