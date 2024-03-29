package HW5.DecoratorTest;
import HW5.Decorator.ApplyLowLoyaltyDiscount;
import HW5.Decorator.ApplyMediumLoyaltyDiscount;
import HW5.Decorator.CustomerOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplyMediumLoyaltyDiscountTest {
    private CustomerOrder mockCustomerOrder;
    ApplyMediumLoyaltyDiscount applyDiscount;

    @BeforeEach
    void setUp() {
        CustomerOrder mockCustomerOrder = new CustomerOrder() {
            @Override
            public double calculateTotalCost() {
                return 100.0;
            }
        };

        applyDiscount = new ApplyMediumLoyaltyDiscount(mockCustomerOrder);
    }

    @Test
    void calculateTotalCost() {
        double discountedTotalCost = applyDiscount.calculateTotalCost();
        assertEquals(80.0, discountedTotalCost); // 20% discount on $100 = $80
    }

    @Test
    void getLoyaltyStatus() {
        String loyaltyStatus = applyDiscount.getLoyaltyStatus();
        assertEquals("Medium", loyaltyStatus);
    }

    @Test
    void getDiscountPercent() {
        double discountPercent = applyDiscount.getDiscountPercent();
        assertEquals(0.20, discountPercent);
    }
}