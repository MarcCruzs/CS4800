package HW4.Macronutrient;

import java.util.Random;

public class FatsFactory implements MacronutrientFactory {
    private DietPlan dietPlan;

    public FatsFactory(DietPlan dietPlan) {
        this.dietPlan = dietPlan;
    }

    @Override
    public String createMeal() {
        Random random = new Random();
        String[] options;
        switch (dietPlan) {
            case NO_RESTRICTION:
                options = new String[]{"Avocado", "Sour cream", "Tuna", "Peanuts"};
                break;
            case PALEO:
                options = new String[]{"Avocado", "Tuna", "Peanuts"};
                break;
            case VEGAN:
                options = new String[]{"Avocado", "Peanuts"};
                break;
            case NUT_ALLERGY:
                options = new String[]{"Avocado", "Sour cream", "Tuna"};
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
        return options[random.nextInt(options.length)];
    }
}

