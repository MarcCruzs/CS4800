package HW4.Macronutrient;

import java.util.Random;

public class CarbsFactory implements Factory {
    private static CarbsFactory instance;

    private CarbsFactory() {}

    public static synchronized CarbsFactory getInstance() {
        if (instance == null) {
            instance = new CarbsFactory();
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
