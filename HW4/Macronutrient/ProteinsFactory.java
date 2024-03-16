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
        Protein[] options;
        switch (dietPlan) {
            case NO_RESTRICTION:
                options = new Protein[]{new Fish(), new Chicken(), new Beef(), new Tofu()};
                break;
            case PALEO:
                options = new Protein[]{new Fish(), new Chicken(), new Beef()};
                break;
            case VEGAN:
                options = new Protein[]{new Tofu()};
                break;
            case NUT_ALLERGY:
                options = new Protein[]{new Fish(), new Chicken(), new Beef(), new Tofu()};
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }
        int index = random.nextInt(options.length);
        Protein selectedProtein = options[index];
        return selectedProtein.getName();
    }
}
