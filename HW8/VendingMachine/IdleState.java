package HW8.VendingMachine;

public class IdleState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void selectSnack(String snackName) {
        System.out.println("Snack selected: " + snackName);
        vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState());
        vendingMachine.setSelectedSnack(snackName);
    }

    public void insertMoney(double amount) {
        System.out.println("Please select a snack first.");
    }

    public void dispenseSnack() {
        System.out.println("Please select a snack first.");
    }
}