package INHERITANCE;

public class SalariedEmployee extends Employee{
    private double weeklySalary;

    /**
     * This constructs Employee Attributes and additional SalariedEmployee attributes
     * @param firstName                 The first name of the Employee
     * @param lastName                  The last name of the Employee
     * @param socialSecurityNumber      The social security number of the Employee
     * @param weeklySalary              The weekly salary the Employee makes
     */
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) {
        this.weeklySalary = weeklySalary;
    }
}
