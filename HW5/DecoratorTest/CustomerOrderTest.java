package HW5.DecoratorTest;

import HW5.Decorator.CustomerOrder;
import HW5.Decorator.FoodItem;
import HW5.Decorator.Item;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CustomerOrderTest {
    private CustomerOrder customerOrder;

    @BeforeEach
    void setUp() {
        customerOrder = new CustomerOrder();
    }

    @Test
    void addItemToOrder(){
        CustomerOrder order = new CustomerOrder();
        Item burger = new FoodItem(5.00);
        order.addItemToOrder(burger);
        assertEquals(1, order.getCustomerOrderList().size());
    }

    @Test
    void calculateTotalCost_NoItem() {
        double totalCost = customerOrder.calculateTotalCost();
        assertEquals(0.0, totalCost);
    }

    @Test
    void calculateTotalCost_WithItems() {
        Item item1 = new FoodItem(10.0);
        Item item2 = new FoodItem(20.0);

        customerOrder.addItemToOrder(item1);
        customerOrder.addItemToOrder(item2);

        double totalCost = customerOrder.calculateTotalCost();
        assertEquals(30.0, totalCost);
    }

    @Test
    void getLoyaltyStatus() {
        String loyaltyStatus = customerOrder.getLoyaltyStatus();
        assertEquals("None", loyaltyStatus);
    }

    @Test
    void getCustomerOrderList() {
        Item item1 = new FoodItem(10.0);
        Item item2 = new FoodItem(20.0);

        customerOrder.addItemToOrder(item1);
        customerOrder.addItemToOrder(item2);

        ArrayList<Item> orderList = customerOrder.getCustomerOrderList();

        // Assert size of order list and items
        assertEquals(2, orderList.size());
        assertEquals(item1, orderList.get(0));
        assertEquals(item2, orderList.get(1));
    }
}