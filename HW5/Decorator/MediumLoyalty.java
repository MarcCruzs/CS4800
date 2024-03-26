package HW5.Decorator;

public class MediumLoyalty implements Loyalty{
    String loyaltyStatus;
    private double discountPercent = .07;
    public MediumLoyalty(){

    }
    @Override
    public double applyDiscount(double totalCost) {
        totalCost = totalCost - (totalCost * discountPercent);
        return totalCost;
    }
}
