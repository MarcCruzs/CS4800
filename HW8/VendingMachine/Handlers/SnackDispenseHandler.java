package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.Snack;

public interface SnackDispenseHandler {
    void setNextHandler(SnackDispenseHandler handler);
    void dispense(Snack snack, double insertedMoney);
}
