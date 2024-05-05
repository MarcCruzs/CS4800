package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.VendingMachine;

public class KitKatHandler extends Handler{
    private VendingMachine vendingMachine;

    public KitKatHandler(Handler next, VendingMachine vendingMachine) {
        super(next, vendingMachine);
        this.vendingMachine = vendingMachine;
    }
    public void processRequest(String snackName, double amount) {
        if (snackName.equals("KitKat")) {
            vendingMachine.selectSnack(snackName);
            vendingMachine.insertMoney(amount);
            vendingMachine.dispenseSnack();
        }
        else {
            super.processRequest(snackName, amount);
        }
    }
}