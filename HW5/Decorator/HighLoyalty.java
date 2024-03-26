package HW5.Decorator;

public class HighLoyalty implements Loyalty{
    String loyaltyStatus;
    private double discountPercent = .10;
    public HighLoyalty(){
    }
    @Override
    public double applyDiscount(double totalCost) {
        totalCost = totalCost - (totalCost * discountPercent);
        return totalCost;
    }
}