package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.VendingMachine;

public class SnickersHandler extends Handler{
    private VendingMachine vendingMachine;

    public SnickersHandler(Handler next, VendingMachine vendingMachine) {
        super(next, vendingMachine);
        this.vendingMachine = vendingMachine;
    }

    public void processRequest(String snackName, double amount) {
        if (snackName.equals("Snickers")) {
            vendingMachine.selectSnack(snackName);
            vendingMachine.insertMoney(amount);
            vendingMachine.dispenseSnack();
        }
        else {
            super.processRequest(snackName, amount);
        }
    }
}
