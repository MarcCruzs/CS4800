package HW5.Decorator;

public class ItemWithExtraPineapple implements Item{
    private Item decoratedItem;
    public ItemWithExtraPineapple(Item item){
        this.decoratedItem = item;
    }

    public double getCost(){
        double cost;
        cost = decoratedItem.getCost() + 2.00;
        return cost;
    }
}