package HW5.Decorator;

public class ItemWithExtraEgg implements Item{
    private Item decoratedItem;
    public ItemWithExtraEgg(Item item){
        this.decoratedItem = item;
    }

    public double getCost(){
        double cost;
        cost = decoratedItem.getCost() + 2.00;
        return cost;
    }
}
