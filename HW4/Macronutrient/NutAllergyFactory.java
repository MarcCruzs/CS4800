package HW4.Macronutrient;

import java.util.Random;

public class NutAllergyFactory implements MacronutrientFactory {
    @Override
    public Meal createMeal() {
        return new Meal(getRandomOptionExceptNuts(MacronutrientOptions.CARBS_OPTIONS),
                getRandomOption(MacronutrientOptions.PROTEIN_OPTIONS),
                getRandomOptionExceptNuts(MacronutrientOptions.FATS_OPTIONS));
    }

    private String getRandomOption(String[] options) {
        Random rand = new Random();
        return options[rand.nextInt(options.length)];
    }

    private String getRandomOptionExceptNuts(String[] options) {
        Random rand = new Random();
        String option;
        do {
            option = options[rand.nextInt(options.length)];
        } while (option.equals("Pistachio") || option.equals("Peanuts"));
        return option;
    }
}

