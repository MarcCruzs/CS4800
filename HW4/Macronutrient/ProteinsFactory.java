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
        String[] options;
        switch (dietPlan) {
            case NO_RESTRICTION:
                options = new String[]{"Fish", "Chicken", "Beef", "Tofu"};
                break;
            case PALEO:
                options = new String[]{"Fish", "Chicken", "Beef"};
                break;
            case VEGAN:
                options = new String[]{"Tofu"};
                break;
            case NUT_ALLERGY:
                options = new String[]{"Fish", "Chicken", "Beef", "Tofu"};
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
        return options[random.nextInt(options.length)];
    }
}
