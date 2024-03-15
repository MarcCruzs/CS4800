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
        String[] options = switch (dietPlan) {
            case NO_RESTRICTION -> new String[]{"Cheese", "Bread", "Lentils", "Pistachio"};
            case PALEO -> new String[]{"Pistachio"};
            case VEGAN -> new String[]{"Bread", "Lentils", "Pistachio"};
            case NUT_ALLERGY -> new String[]{"Cheese", "Bread", "Lentils"};
            default -> throw new IllegalArgumentException("Invalid diet plan");
        };
        return options[random.nextInt(options.length)];
    }
}


