package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.Snack;
import HW8.VendingMachine.VendingMachine;

class CokeHandler implements SnackDispenseHandler {
    private SnackDispenseHandler nextHandler;
    private VendingMachine vendingMachine;

    public CokeHandler(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void setNextHandler(SnackDispenseHandler handler) {
        this.nextHandler = handler;
    }

    public void dispense(Snack snack, double insertedMoney) {
        vendingMachine.getCurrentState().dispenseSnack(snack, insertedMoney);
    }
}