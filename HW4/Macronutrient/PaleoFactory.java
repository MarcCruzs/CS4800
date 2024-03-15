package HW4.Macronutrient;

import java.util.Random;

public class PaleoFactory implements MacronutrientFactory {
    @Override
    public Meal createMeal() {
        return new Meal(MacronutrientOptions.CARBS_OPTIONS[2], // Only Pistachio is allowed
                getRandomOptionExceptItem(MacronutrientOptions.PROTEIN_OPTIONS, "Tofu"),
                getRandomOptionExceptItem(MacronutrientOptions.FATS_OPTIONS, "Sour cream"));
    }

    private String getRandomOptionExceptItem(String[] options, String item) {
        Random rand = new Random();
        String option;
        do {
            option = options[rand.nextInt(options.length)];
        } while (option.equals(item));
        return option;
    }

    private String getRandomOption(String[] options) {
        Random rand = new Random();
        return options[rand.nextInt(options.length)];
    }
}
