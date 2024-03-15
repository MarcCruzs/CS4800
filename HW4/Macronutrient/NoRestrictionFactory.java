package HW4.Macronutrient;

import java.util.Random;

public class NoRestrictionFactory implements MacronutrientFactory {
    @Override
    public Meal createMeal() {
        return new Meal(getRandomOption(MacronutrientOptions.CARBS_OPTIONS),
                getRandomOption(MacronutrientOptions.PROTEIN_OPTIONS),
                getRandomOption(MacronutrientOptions.FATS_OPTIONS));
    }

    private String getRandomOption(String[] options) {
        Random rand = new Random();
        return options[rand.nextInt(options.length)];
    }
}

