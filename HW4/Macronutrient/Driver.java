package HW4.Macronutrient;

import java.util.ArrayList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Customer> customers = createCustomers();
        AbstractFactory abstractFactory = new MacronutrientFactory();
        MealGenerator mealGenerator = new MealGenerator(abstractFactory);

        for (Customer customer : customers) {
            String meal = mealGenerator.generateMeal(customer);
            System.out.println(customer.getName() + "'s Meal: " + meal);
        }
    }

    private static List<Customer> createCustomers() {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Alice", "No Restriction"));
        customers.add(new Customer("Bob", "Paleo"));
        customers.add(new Customer("Charlie", "Vegan"));
        customers.add(new Customer("David", "Nut Allergy"));
        customers.add(new Customer("Eve", "Paleo"));
        customers.add(new Customer("Frank", "No Restriction"));
        return customers;
    }
}
