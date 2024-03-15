package HW4.Macronutrient;

import java.util.Random;

public class MealGenerator {
    private AbstractFactory abstractFactory;

    public MealGenerator(AbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public String generateMeal(Customer customer) {
        Carbs carbs = abstractFactory.createCarbs();
        Protein protein = abstractFactory.createProtein();
        Fats fats = abstractFactory.createFats();

        // Check if the generated meal complies with the customer's diet plan
        if (!isValidMeal(customer, carbs, protein, fats)) {
            // Regenerate meal until it complies with the customer's diet plan
            return generateMeal(customer);
        }

        return "Carbs: " + carbs.getName() + ", Protein: " + protein.getName() + ", Fats: " + fats.getName();
    }

    private boolean isValidMeal(Customer customer, Carbs carbs, Protein protein, Fats fats) {
        // Implement logic to validate if the generated meal complies with the customer's diet plan
        // You can use customer.getDietPlan() to access the customer's diet plan
        // Implement your diet plan restrictions checking here
        return true; // Temporary return, modify as per requirements
    }
}


