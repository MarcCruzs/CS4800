package HW5.Decorator;

public class ApplyMediumLoyaltyDiscount extends CustomerOrder {
    String loyaltyStatus = "Medium";
    private double discountPercent = .20;
    private CustomerOrder customerOrder;
    public ApplyMediumLoyaltyDiscount(CustomerOrder customerOrder){
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
