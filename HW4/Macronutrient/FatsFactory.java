package HW4.Macronutrient;

import java.util.Random;

public class FatsFactory implements Factory {
    private static FatsFactory instance;

    private FatsFactory() {}

    public static synchronized FatsFactory getInstance() {
        if (instance == null) {
            instance = new FatsFactory();
        }
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        // Implement creation logic
        return null;
    }

    @Override
    public Protein createProtein() {
        // Implement creation logic
        return null;
    }

    @Override
    public Fats createFats() {
        // Implement creation logic
        return null;
    }
}

