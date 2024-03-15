package HW4.Macronutrient;

public interface AbstractFactory {
    Carbs createCarbs();
    Protein createProtein();
    Fats createFats();
}
