package HW5.Decorator;

public class LowLoyalty implements Loyalty{
    String loyaltyStatus;
    private double discountPercent = .05;
    public LowLoyalty(){
    }
    @Override
    public double applyDiscount(double totalCost) {
        totalCost = totalCost - (totalCost * discountPercent);
        return totalCost;
    }
}
