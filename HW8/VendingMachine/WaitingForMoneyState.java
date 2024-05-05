package HW8.VendingMachine;

class WaitingForMoneyState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public WaitingForMoneyState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void selectSnack(String snackName) {
        System.out.println("Already waiting for money.");
    }

    public void insertMoney(double amount) {
        System.out.println("Money inserted: " + amount);
        vendingMachine.setInsertedMoney(amount);
        if (amount >= vendingMachine.getSelectedSnack().getPrice()) {
            vendingMachine.getCurrentState().dispenseSnack();
        } else {
            System.out.println("Please insert more money.");
        }
    }

    public void dispenseSnack() {
        System.out.println("Please insert money first.");
    }
}