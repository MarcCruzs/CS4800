package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.VendingMachine;

public class PepsiHandler extends Handler{
    private VendingMachine vendingMachine;

    public PepsiHandler(Handler next, VendingMachine vendingMachine) {
        super(next, vendingMachine);
        this.vendingMachine = vendingMachine;
    }
    public void processRequest(String snackName, double amount) {
        if (snackName.equals("Pepsi")) {
            vendingMachine.selectSnack(snackName);
            vendingMachine.insertMoney(amount);
            vendingMachine.dispenseSnack();
        }
        else {
            super.processRequest(snackName, amount);
        }
    }
}

