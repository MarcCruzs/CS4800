package HW4.Macronutrient;

public class Customer {
    private String name;
    private DietPlan dietPlan;

    public Customer(String name, DietPlan dietPlan) {
        this.name = name;
        this.dietPlan = dietPlan;
    }

    public String getName() {
        return name;
    }

    public DietPlan getDietPlan() {
        return dietPlan;
    }

    public Meal generateMeal() {
        MacronutrientFactory factory = MacronutrientFactorySingleton.getInstance().getFactory(dietPlan);
        return factory.createMeal();
    }
}
