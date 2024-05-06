package HW8.VendingMachine;

public class WaitingForMoneyState implements StateOfVendingMachine {

    public void selectSnack(VendingMachine vendingMachine, String snackName) {
    }

    public void insertMoney(VendingMachine vendingMachine, double amount) {
        vendingMachine.setCurrentAmount(vendingMachine.getCurrentAmount() + amount);
        Snack selectedSnack = vendingMachine.getCurrentSnack();

        if (vendingMachine.getCurrentAmount() >= selectedSnack.getPrice()) {
            System.out.println("Funds accepted.");
            vendingMachine.setCurrentAmount(vendingMachine.getCurrentAmount() - selectedSnack.getPrice());
            vendingMachine.setState(new DispensingSnackState());
        }
        else{
            System.out.println("Insufficient Funds.");
        }
    }

    public void dispenseSnack(VendingMachine vendingMachine) {
    }
}