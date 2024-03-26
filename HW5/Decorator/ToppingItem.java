package HW5.Decorator;

public class ToppingItem implements Item{
    private double cost;
    private String name;

    public ToppingItem(double cost, String name){
        this.cost = cost;
        this.name = name;
    }

    public double getCost() {
        return 0;
    }

    public String getName() {
        return null;
    }
}
