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
        Fat[] options;
        switch (dietPlan) {
            case NO_RESTRICTION:
                options = new Fat[]{new Avocado(), new SourCream(), new Tuna(), new Peanuts()};
                break;
            case PALEO:
                options = new Fat[]{new Avocado(), new Tuna(), new Peanuts()};
                break;
            case VEGAN:
                options = new Fat[]{new Avocado(), new Peanuts()};
                break;
            case NUT_ALLERGY:
                options = new Fat[]{new Avocado(), new SourCream(), new Tuna()};
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }

        int index = random.nextInt(options.length);
        Fat selectedFat = options[index];
        return selectedFat.getName();
    }
}
