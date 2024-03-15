package HW4.Macronutrient;

import java.util.Random;

public class ProteinsFactory implements MacronutrientFactory {
    private DietPlan dietPlan;

    public ProteinsFactory(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    @Override
    public String createMeal() {
        Random random = new Random();
        String[] options = switch (dietPlan) {
            case NO_RESTRICTION -> new String[]{"Fish", "Chicken", "Beef", "Tofu"};
            case PALEO -> new String[]{"Fish", "Chicken", "Beef"};
            case VEGAN -> new String[]{"Tofu"};
            case NUT_ALLERGY -> new String[]{"Fish", "Chicken", "Beef", "Tofu"};
            default -> throw new IllegalArgumentException("Invalid diet plan");
        };
        return options[random.nextInt(options.length)];
    }
}
