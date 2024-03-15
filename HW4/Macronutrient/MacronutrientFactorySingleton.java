package HW4.Macronutrient;

public class MacronutrientFactorySingleton {
    private static MacronutrientFactorySingleton instance;

    private MacronutrientFactory noRestrictionFactory;
    private MacronutrientFactory paleoFactory;
    private MacronutrientFactory veganFactory;
    private MacronutrientFactory nutAllergyFactory;

    private MacronutrientFactorySingleton() {
        noRestrictionFactory = new NoRestrictionFactory();
        paleoFactory = new PaleoFactory();
        veganFactory = new VeganFactory();
        nutAllergyFactory = new NutAllergyFactory();
    }

    public static MacronutrientFactorySingleton getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactorySingleton();
        }
        return instance;
    }

    public MacronutrientFactory getFactory(DietPlan dietPlan) {
        switch (dietPlan) {
            case NO_RESTRICTION:
                return noRestrictionFactory;
            case PALEO:
                return paleoFactory;
            case VEGAN:
                return veganFactory;
            case NUT_ALLERGY:
                return nutAllergyFactory;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
    }
}
