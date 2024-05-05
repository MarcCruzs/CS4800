package HW8.VendingMachine;

class DispensingSnackState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public DispensingSnackState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    public void selectSnack(String snackName) {
        System.out.println("Already dispensing snack.");
    }

    public void insertMoney(double amount) {
        System.out.println("Already dispensing snack.");
    }

    public void dispenseSnack() {
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        if (selectedSnack.getQuantity() > 0) {
            System.out.println("Dispensing " + selectedSnack.getName());
            selectedSnack.setQuantity(selectedSnack.getQuantity() - 1);
        } else {
            System.out.println("Out of stock for " + selectedSnack.getName());
        }
        vendingMachine.setCurrentState(vendingMachine.getIdleState());
    }
}
