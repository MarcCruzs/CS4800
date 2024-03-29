package HW5.DecoratorTest;
import HW5.Decorator.ApplyLowLoyaltyDiscount;
import HW5.Decorator.CustomerOrder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ApplyLowLoyaltyDiscountTest {

    @Test
    void calculateTotalCost() {
        CustomerOrder mockCustomerOrder = new CustomerOrder() {
            @Override
            public double calculateTotalCost() {
                return 100.0;
            }
        };

        ApplyLowLoyaltyDiscount applyDiscount = new ApplyLowLoyaltyDiscount(mockCustomerOrder);

        double discountedTotalCost = applyDiscount.calculateTotalCost();
        assertEquals(90.0, discountedTotalCost); // 10% discount on $100 = $90
    }

    @Test
    void getLoyaltyStatus() {
        CustomerOrder mockCustomerOrder = new CustomerOrder();
        ApplyLowLoyaltyDiscount applyDiscount = new ApplyLowLoyaltyDiscount(mockCustomerOrder);

        String loyaltyStatus = applyDiscount.getLoyaltyStatus();
        assertEquals("Low", loyaltyStatus);
    }

    @Test
    void getDiscountPercent() {
        CustomerOrder mockCustomerOrder = new CustomerOrder();
        ApplyLowLoyaltyDiscount applyDiscount = new ApplyLowLoyaltyDiscount(mockCustomerOrder);

        double discountPercent = applyDiscount.getDiscountPercent();
        assertEquals(0.10, discountPercent);
    }
}