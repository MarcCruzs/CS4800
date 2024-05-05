package HW8.VendingMachine;

class IdleState implements StateOfVendingMachine {

    public void selectSnack(VendingMachine vendingMachine, String snackName) {
        Snack snack = vendingMachine.getSnack(snackName);
        if (snack != null && snack.getQuantity() > 0) {
            vendingMachine.setCurrentSnack(snack);
            vendingMachine.setState(new WaitingForMoneyState());
            System.out.println(snackName + " has been selected for $" + snack.getQuantity());
        } else if (snack.getQuantity() == 0){
            System.out.println(snackName + " is out of stock.");
        } else{
            System.out.println(snackName + " is not available.");
        }
    }

    public void insertMoney(VendingMachine vendingMachine, double amount) {
    }

    public void dispenseSnack(VendingMachine vendingMachine) {
    }
}