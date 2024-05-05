package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.VendingMachine;

public abstract class Handler {
    private Handler next;
    private VendingMachine vendingMachine;

    public Handler (Handler next, VendingMachine vendingMachine) {
        if (next != null){
            this.next = next;
        }
        this.vendingMachine = vendingMachine;
    }

    public void processRequest(String snackName, double amount) {
        if (next != null){
            next.processRequest(snackName, amount);
        }
    }
}
