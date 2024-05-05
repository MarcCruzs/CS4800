package HW8.VendingMachine;

import java.util.Map;

class DispensingSnackState implements StateOfVendingMachine {

    public void selectSnack(VendingMachine vendingMachine, String snackName) {
    }

    public void insertMoney(VendingMachine vendingMachine, double amount) {
    }

    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Dispencing " + vendingMachine.getCurrentSnack().getName() + "\n");
        vendingMachine.setState(new IdleState());
    }
}


