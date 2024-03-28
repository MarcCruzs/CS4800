package HW5.Decorator;

public class ApplyHighLoyaltyDiscount extends CustomerOrder{
    String loyaltyStatus = "High";
    private double discountPercent = .30;
    private CustomerOrder customerOrder;
    public ApplyHighLoyaltyDiscount(CustomerOrder customerOrder){
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