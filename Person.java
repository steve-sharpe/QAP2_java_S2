public class Person {
    private String lastName;
    private String firstName;
    private Address home;

    // constructor

    public Person(String lastName, String firstName, Address home) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    // toString method

    public String toString() {
        return lastName + "," + firstName + "," + home;
    }

}