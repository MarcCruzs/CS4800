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

    public void dispenseSnack(Snack snack, double insertedMoney) {
        if (snack.getQuantity() > 0 && insertedMoney >= snack.getPrice()) {
            System.out.println("Dispensing " + snack.getName());
            snack.setQuantity(snack.getQuantity() - 1);
            vendingMachine.setCurrentState(vendingMachine.getIdleState()); // Transition to Idle state
        } else {
            System.out.println("Out of stock for " + snack.getName() + " or insufficient funds.");
            vendingMachine.setCurrentState(vendingMachine.getIdleState()); // Transition to Idle state
        }
    }

}
