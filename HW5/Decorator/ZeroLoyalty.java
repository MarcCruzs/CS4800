package HW5.Decorator;

public class ZeroLoyalty implements Loyalty{
    String loyaltyStatus;
    private double discountPercent = 0;
    public ZeroLoyalty(){
    }
    @Override
    public double applyDiscount(double totalCost) {
        return totalCost;
    }
}
