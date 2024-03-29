package HW5.DecoratorTest;
import HW5.Decorator.ApplyHighLoyaltyDiscount;
import HW5.Decorator.CustomerOrder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplyHighLoyaltyDiscountTest {

    @Test
    void calculateTotalCost() {
        CustomerOrder mockCustomerOrder = new CustomerOrder() {
            @Override
            public double calculateTotalCost() {
                return 100.0;
            }
        };

        ApplyHighLoyaltyDiscount applyDiscount = new ApplyHighLoyaltyDiscount(mockCustomerOrder);

        double discountedTotalCost = applyDiscount.calculateTotalCost();
        assertEquals(70.0, discountedTotalCost); // 30% discount on $100 = $70
    }

    @Test
    void getLoyaltyStatus() {
        CustomerOrder mockCustomerOrder = new CustomerOrder();
        ApplyHighLoyaltyDiscount applyDiscount = new ApplyHighLoyaltyDiscount(mockCustomerOrder);

        String loyaltyStatus = applyDiscount.getLoyaltyStatus();
        assertEquals("High", loyaltyStatus);
    }

    @Test
    void getDiscountPercent() {
        CustomerOrder mockCustomerOrder = new CustomerOrder();
        ApplyHighLoyaltyDiscount applyDiscount = new ApplyHighLoyaltyDiscount(mockCustomerOrder);

        double discountPercent = applyDiscount.getDiscountPercent();
        assertEquals(0.30, discountPercent);
    }
}