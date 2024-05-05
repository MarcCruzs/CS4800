package HW8.VendingMachine;

import java.util.Map;

class DispensingSnackState implements StateOfVendingMachine {
    private VendingMachine vendingMachine;

    public DispensingSnackState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectSnack(String snack) {
        System.out.println("Currently dispensing a snack. Please wait.");
    }

    @Override
    public void insertMoney(double amount) {
        System.out.println("Already dispensing a snack. Please wait.");
    }

    @Override
    public void dispenseSnack() {
        String selectedSnack = vendingMachine.getSelectedSnack();
        Map<String, Snack> snacks = vendingMachine.getSnacks();
        Snack snack = snacks.get(selectedSnack);

        if (snack != null) {
            if (snack.getQuantity() > 0) {
                double amountInserted = vendingMachine.getAmountInserted();
                if (amountInserted >= snack.getPrice()) {
                    snack.decreaseQuantity();
                    System.out.println("Dispensing " + snack.getName() + ". Enjoy!");
                    vendingMachine.setAmountInserted(0); // Reset amount inserted
                    vendingMachine.setCurrentState(vendingMachine.getIdleState()); // Transition to idle state
                } else {
                    System.out.println("Insufficient amount inserted. Returning money.");
                    vendingMachine.setAmountInserted(0); // Reset amount inserted
                    vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState()); // Transition to waiting for money state
                }
            } else {
                System.out.println("Selected snack is out of stock. Returning money.");
                vendingMachine.setAmountInserted(0); // Reset amount inserted
                vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState()); // Transition to waiting for money state
            }
        } else {
            System.out.println("Invalid snack selected. Returning money.");
            vendingMachine.setAmountInserted(0); // Reset amount inserted
            vendingMachine.setCurrentState(vendingMachine.getWaitingForMoneyState()); // Transition to waiting for money state
        }
    }
}



