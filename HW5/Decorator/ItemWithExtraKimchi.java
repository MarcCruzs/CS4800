package HW5.Decorator;

public class ItemWithExtraKimchi implements Item{
    private Item decoratedItem;
    public ItemWithExtraKimchi(Item item){
        this.decoratedItem = item;
    }

    public double getCost(){
        double cost;
        cost = decoratedItem.getCost() + 3.75;
        return cost;
    }
}
