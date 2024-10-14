package INHERITANCE;

public class BaseEmployee extends Employee{
    private double baseSalary;

    /**
     *
     * @param firstName                 The first name of the Employee
     * @param lastName                  The last name of the Employee
     * @param socialSecurityNumber      The social security number of the Employee
     * @param baseSalary                The fixed amount an employee must be paid for their work
     */
    public BaseEmployee(String firstName, String lastName, String socialSecurityNumber, double baseSalary) {
        super(firstName, lastName, socialSecurityNumber);
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}
