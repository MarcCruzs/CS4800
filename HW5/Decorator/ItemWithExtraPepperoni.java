package HW5.Decorator;

public class ItemWithExtraPepperoni implements Item{
    private Item decoratedItem;
    public ItemWithExtraPepperoni(Item item){
        this.decoratedItem = item;
    }

    public double getCost(){
        double cost;
        cost = decoratedItem.getCost() + 1.50;
        return cost;
    }
}

