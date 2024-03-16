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
        Carb[] options;
        switch (dietPlan) {
            case NO_RESTRICTION:
                options = new Carb[]{new Cheese(), new Bread(), new Lentils(), new Pistachio()};
                break;
            case PALEO:
                options = new Carb[]{new Pistachio()};
                break;
            case VEGAN:
                options = new Carb[]{new Bread(), new Lentils(), new Pistachio()};
                break;
            case NUT_ALLERGY:
                options = new Carb[]{new Cheese(), new Bread(), new Lentils()};
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }

        int index = random.nextInt(options.length);
        Carb selectedCarb = options[index];
        return selectedCarb.getName();
    }
}
