package HW4.Macronutrient;

import java.util.Random;

public class ProteinFactory implements Factory {
    private static ProteinFactory instance;

    private ProteinFactory() {}

    public static synchronized ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
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
