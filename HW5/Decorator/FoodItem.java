package HW5.Decorator;
import java.util.ArrayList;

public class FoodItem implements Item {
    private double cost;
    private ArrayList<Item> toppingList = new ArrayList<>();

    public FoodItem(double cost) {
        this.cost = cost;
    }

    public void addTopping(Item topping) {
        toppingList.add(topping);
    }

    public double getCost() {
        return cost;
    }

    public ArrayList<Item> getToppingList() {
        return toppingList;
    }
}
