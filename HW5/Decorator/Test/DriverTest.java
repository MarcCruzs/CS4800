package HW5.Decorator.Test;
import HW5.Decorator.*;
import static org.junit.jupiter.api.Assertions.*;

class DriverTest {
    @org.junit.jupiter.api.Test
    public void testAddSingleItemsToOrder() {
        CustomerOrder order = new CustomerOrder();
        Item burger = new FoodItem(5.00);
        order.addItemToOrder(burger);
        assertEquals(1, order.getCustomerOrderList().size()); // Ensure item added to order
    }

    @org.junit.jupiter.api.Test
    public void testAddMultipleItemsToOrder() {
        CustomerOrder order = new CustomerOrder();
        Item burger = new FoodItem(5.00);
        order.addItemToOrder(burger);
        order.addItemToOrder(burger);
        order.addItemToOrder(burger);
        order.addItemToOrder(burger);
        order.addItemToOrder(burger);
        assertEquals(5, order.getCustomerOrderList().size()); // Ensure item added to order
    }

    @org.junit.jupiter.api.Test
    public void testApplyNoLoyaltyDiscount() {
        CustomerOrder order = new CustomerOrder();
        Item pizza = new FoodItem(10.00);
        order.addItemToOrder(pizza);

        assertEquals(10.00, order.calculateTotalCost(), 0.001);
        assertEquals("None", order.getLoyaltyStatus());
    }
    @org.junit.jupiter.api.Test
    public void testApplyLowLoyaltyDiscount() {
        CustomerOrder order = new CustomerOrder();
        Item pizza = new FoodItem(10.00);
        order.addItemToOrder(pizza);

        order = new ApplyLowLoyaltyDiscount(order);
        assertEquals(9.00, order.calculateTotalCost(), 0.001);
        assertEquals("Low", order.getLoyaltyStatus());
    }

    @org.junit.jupiter.api.Test
    public void testApplyMediumLoyaltyDiscount() {
        CustomerOrder order = new CustomerOrder();
        Item pizza = new FoodItem(10.00);
        order.addItemToOrder(pizza);

        // Apply medium loyalty discount
        order = new ApplyMediumLoyaltyDiscount(order);
        assertEquals(8.00, order.calculateTotalCost(), 0.001);
        assertEquals("Medium", order.getLoyaltyStatus());
    }

    @org.junit.jupiter.api.Test
    public void testApplyHighLoyaltyDiscount() {
        CustomerOrder order = new CustomerOrder();
        Item pizza = new FoodItem(10.00);
        order.addItemToOrder(pizza);

        order = new ApplyHighLoyaltyDiscount(order);
        assertEquals(7.00, order.calculateTotalCost(), 0.001);
        assertEquals("High", order.getLoyaltyStatus());
    }

    @org.junit.jupiter.api.Test
    public void testCalculateTotalCost() {
        Item burger = new FoodItem(5.00);
        Item pizza = new FoodItem(10.00);

        CustomerOrder order1 = new CustomerOrder();
        order1.addItemToOrder(burger);
        assertEquals(5.00, order1.calculateTotalCost(), 0.001);

        CustomerOrder order2 = new CustomerOrder();
        order2.addItemToOrder(pizza);
        order2.addItemToOrder(pizza);
        assertEquals(20.00, order2.calculateTotalCost(), 0.001);
    }
}