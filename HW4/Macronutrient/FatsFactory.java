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
        String[] options = switch (dietPlan) {
            case NO_RESTRICTION -> new String[]{"Avocado", "Sour cream", "Tuna", "Peanuts"};
            case PALEO -> new String[]{"Avocado", "Tuna", "Peanuts"};
            case VEGAN -> new String[]{"Avocado", "Peanuts"};
            case NUT_ALLERGY -> new String[]{"Avocado", "Sour cream", "Tuna"};
            default -> throw new IllegalArgumentException("Invalid diet plan");
        };
        return options[random.nextInt(options.length)];
    }
}

