package HW4.Macronutrient;

public class MacronutrientFactorySingleton {
    private static MacronutrientFactorySingleton instance;

    private MacronutrientFactory carbsFactory;
    private MacronutrientFactory proteinsFactory;
    private MacronutrientFactory fatsFactory;

    private MacronutrientFactorySingleton(DietPlan dietPlan) {
        carbsFactory = new CarbsFactory(dietPlan);
        proteinsFactory = new ProteinsFactory(dietPlan);
        fatsFactory = new FatsFactory(dietPlan);
    }

    public static MacronutrientFactorySingleton getInstance(DietPlan dietPlan) {
        if (instance == null) {
            instance = new MacronutrientFactorySingleton(dietPlan);
        }
        return instance;
    }

    public MacronutrientFactory getCarbsFactory() {
        return carbsFactory;
    }

    public MacronutrientFactory getProteinsFactory() {
        return proteinsFactory;
    }

    public MacronutrientFactory getFatsFactory() {
        return fatsFactory;
    }
}

