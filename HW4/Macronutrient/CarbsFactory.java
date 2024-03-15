package HW4.Macronutrient;

import java.util.Random;

public class CarbsFactory implements MacronutrientFactory {
    private DietPlan dietPlan;

    public CarbsFactory(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    @Override
    public String createMeal() {
        Random random = new Random();
        String[] options;
        switch (dietPlan) {
            case NO_RESTRICTION:
                options = new String[]{"Cheese", "Bread", "Lentils", "Pistachio"};
                break;
            case PALEO:
                options = new String[]{"Pistachio"};
                break;
            case VEGAN:
                options = new String[]{"Bread", "Lentils", "Pistachio"};
                break;
            case NUT_ALLERGY:
                options = new String[]{"Cheese", "Bread", "Lentils"};
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
        return options[random.nextInt(options.length)];
    }
}


