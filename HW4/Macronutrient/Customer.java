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
        MacronutrientFactorySingleton factorySingleton = MacronutrientFactorySingleton.getInstance(dietPlan);
        MacronutrientFactory carbsFactory = factorySingleton.getCarbsFactory();
        MacronutrientFactory proteinsFactory = factorySingleton.getProteinsFactory();
        MacronutrientFactory fatsFactory = factorySingleton.getFatsFactory();

        return new Meal(carbsFactory, proteinsFactory, fatsFactory);
    }
}

