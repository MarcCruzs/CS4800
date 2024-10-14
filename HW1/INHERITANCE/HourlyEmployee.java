package INHERITANCE;

public class HourlyEmployee extends Employee{
    private double wage;
    private int hoursWorked;

    /**
     * This constructs Employee Attributes and additional Hourly Employee attributes
     * @param firstName                 The first name of the Employee
     * @param lastName                  The last name of the Employee
     * @param socialSecurityNumber      The social security number of the Employee
     * @param wage                      Amount of money made per hour
     * @param hoursWorked               Amount of hours worked
     */
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, int hoursWorked) {
        super(firstName, lastName, socialSecurityNumber);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
