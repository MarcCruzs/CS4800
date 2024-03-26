package HW5.Decorator;

import java.util.ArrayList;

public class CustomerOrder {
    private ArrayList<Item> customerOrderList = new ArrayList<>();

    public CustomerOrder(){
    }

    public void addItemToOrder(Item item){
        customerOrderList.add(item);
    }
    public double calculateTotalCost(){
        double totalCost = 0;
        for (int i = 0; i < customerOrderList.size(); i++) {
            Item item = customerOrderList.get(i);
            totalCost += item.getCost();
        }

        return totalCost;
        }
}
