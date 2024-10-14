package INHERITANCE;

public class CommissionEmployee extends Employee{
    private double commissionRate;
    private double grossSales;

    /**
     * This constructs Employee Attributes and additional CommisionEmployee attributes
     * @param firstName                 The first name of the Employee
     * @param lastName                  The last name of the Employee
     * @param socialSecurityNumber      The social security number of the Employee
     * @param commissionRate            A set percentage of a gross sale that is rewarded to a Commission
     * @param grossSales                The total amount of sales
     */
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double commissionRate, double grossSales) {
        super(firstName, lastName, socialSecurityNumber);
        this.commissionRate = commissionRate;
        this.grossSales = grossSales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    public double getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(double grossSales) {
        this.grossSales = grossSales;
    }
}
