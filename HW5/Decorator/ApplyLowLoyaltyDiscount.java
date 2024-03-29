package HW5.Decorator;

public class ApplyLowLoyaltyDiscount extends CustomerOrder{
    String loyaltyStatus = "Low";
    private double discountPercent = .10;
    private CustomerOrder customerOrder;

    public ApplyLowLoyaltyDiscount(CustomerOrder customerOrder){
        this.customerOrder = customerOrder;
    }

    @Override
    public double calculateTotalCost() {
        double preDiscountTotalCost;
        double discountedTotalCost;
        preDiscountTotalCost = customerOrder.calculateTotalCost();
        discountedTotalCost = preDiscountTotalCost - (preDiscountTotalCost * discountPercent);
        return discountedTotalCost;
    }

    public String getLoyaltyStatus(){
        return this.loyaltyStatus;
    }

    public Double getDiscountPercent(){
        return this.discountPercent;
    }
}
