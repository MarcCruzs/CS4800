package INHERITANCE;

/**
 * Superclass that contains the basic properties of an Employee
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    /**
     * Constructs the basic attributes of an Employee
     * @param firstName                 First name of the Employee
     * @param lastName                  Last name of the Employee
     * @param socialSecurityNumber      Social Security Number of the Employee
     */
    public Employee(String firstName, String lastName, String socialSecurityNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }
}
