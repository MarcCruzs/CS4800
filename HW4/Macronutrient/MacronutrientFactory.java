package HW4.Macronutrient;

import java.util.Random;

public class MacronutrientFactory implements AbstractFactory {
    private static MacronutrientFactory instance;

    MacronutrientFactory() {}

    public static synchronized MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactory();
        }
        return instance;
    }

    @Override
    public Carbs createCarbs() {
        Random random = new Random();
        switch (random.nextInt(3)) { // Change to 3 for 3 options
            case 0:
                return new Bread();
            case 1:
                return new Lentils();
            case 2:
                return new Pistachio();
            default:
                return null; // This should not occur, but return null to handle any unexpected cases
        }
    }

    @Override
    public Protein createProtein() {
        Random random = new Random();
        switch (random.nextInt(3)) { // Change to 3 for 3 options
            case 0:
                return new Chicken();
            case 1:
                return new Fish();
            case 2:
                return new Beef();
            default:
                return null;
        }
    }

    @Override
    public Fats createFats() {
        Random random = new Random();
        switch (random.nextInt(3)) { // Change to 3 for 3 options
            case 0:
                return new Avocado();
            case 1:
                return new SourCream();
            case 2:
                return new Tuna();
            default:
                return null;
        }
    }
}

