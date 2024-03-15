package HW4.Macronutrient;

public class Meal {
    private String carbs;
    private String protein;
    private String fats;

    public Meal(String carbs, String protein, String fats) {
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public Meal(MacronutrientFactory carbsFactory, MacronutrientFactory proteinsFactory, MacronutrientFactory fatsFactory) {
        this.carbs = String.valueOf(carbsFactory.createMeal());
        this.protein = String.valueOf(proteinsFactory.createMeal());
        this.fats = String.valueOf(fatsFactory.createMeal());
    }

    public String getCarbs() {
        return carbs;
    }

    public String getProtein() {
        return protein;
    }

    public String getFats() {
        return fats;
    }

    @Override
    public String toString() {
        return "Carbs: " + carbs + ", Protein: " + protein + ", Fats: " + fats;
    }
}



