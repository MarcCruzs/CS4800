package HW5.Decorator;
import java.util.ArrayList;

public class FoodItem implements Item{
    private double cost;
    private String name;

    private ArrayList<ToppingItem> toppingList = new ArrayList<>();
    public FoodItem(double cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public void addTopping(ToppingItem topping){
        toppingList.add(topping);
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
