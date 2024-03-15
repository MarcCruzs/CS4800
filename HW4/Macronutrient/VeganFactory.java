package HW4.Macronutrient;

import java.util.Random;

public class VeganFactory implements MacronutrientFactory {
    @Override
    public Meal createMeal() {
        return new Meal(getRandomOptionExceptItem(MacronutrientOptions.CARBS_OPTIONS, "Cheese"),
                MacronutrientOptions.PROTEIN_OPTIONS[3], // Only Tofu is allowed
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

    private String getRandomOptionExceptAvocado(String[] options) {
        Random rand = new Random();
        String option;
        do {
            option = options[rand.nextInt(options.length)];
        } while (option.equals("Avocado"));
        return option;
    }
}

