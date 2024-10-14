package INHERITANCE;

public class Test {
    public static void main(String[] args){
        // Create an array of employees
        Employee[] employees = {
                new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500.0),
                new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25.0, 32),
                new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19.0, 47),
                new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000.0),
                new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 1700.0),
                new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000.0),
                new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000.0)
        };

        // Display table header
        System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-18s %-15s %-15s\n",
                "First Name", "Last Name", "Social Sec #", "Weekly Salary", "Wage", "Hours Worked", "Commission Rate", "Gross Sales", "Base Salary");

        // Display information for each employee
        for (Employee employee : employees) {
            if (employee instanceof SalariedEmployee) {
                System.out.printf("%-15s %-15s %-15s $%-14.2f %-15s %-15s %-18s %-15s %-15s\n",
                        employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(),
                        ((SalariedEmployee) employee).getWeeklySalary(), "-", "-", "-", "-", "-");
            } else if (employee instanceof HourlyEmployee) {
                System.out.printf("%-15s %-15s %-15s %-15s $%-14.2f %-15d %-18s %-15s %-15s\n",
                        employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(),
                        "-", ((HourlyEmployee) employee).getWage(), ((HourlyEmployee) employee).getHoursWorked(), "-", "-", "-");
            } else if (employee instanceof CommissionEmployee) {
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %.2f%% %19s %9s\n",
                        employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(),
                        "-", "-", "-", ((CommissionEmployee) employee).getCommissionRate() * 100, ((CommissionEmployee) employee).getGrossSales(), "-");
            } else if (employee instanceof BaseEmployee) {
                System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s %-18s %-15s $%-14.2f\n",
                        employee.getFirstName(), employee.getLastName(), employee.getSocialSecurityNumber(),
                        "-", "-", "-", "-", "-", ((BaseEmployee) employee).getBaseSalary());
            }
        }
    }

}
