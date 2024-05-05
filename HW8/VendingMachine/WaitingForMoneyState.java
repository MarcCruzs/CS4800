package HW8.VendingMachine;

public class WaitingForMoneyState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snack) {
        System.out.println("Already waiting for money. Cannot select another snack.");
    }

    @Override
    public void insertMoney(double amount) {
        vendingMachine.setAmountInserted(amount);
        vendingMachine.setCurrentState(vendingMachine.getDispensingSnackState());
    }

    @Override
    public void dispenseSnack() {
        System.out.println("Please insert money first.");
    }
}