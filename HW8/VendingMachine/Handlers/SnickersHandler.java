package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.Snack;

public class SnickersHandler implements SnackDispenseHandler {
    private SnackDispenseHandler nextHandler;

    public void setNextHandler(SnackDispenseHandler handler) {
        this.nextHandler = handler;
    }

    public void dispense(Snack snack, double insertedMoney) {
        vendingMachine.getCurrentState().dispenseSnack(snack, insertedMoney);
    }

}
