package HW8.VendingMachine;

class CokeHandler implements SnackDispenseHandler {
    private SnackDispenseHandler nextHandler;

    public void setNextHandler(SnackDispenseHandler handler) {
        this.nextHandler = handler;
    }

    public void dispense(Snack snack, double insertedMoney) {
        if (snack.getName().equals("Coke") && snack.getQuantity() > 0 && insertedMoney >= snack.getPrice()) {
            System.out.println("Dispensing " + snack.getName());
            snack.setQuantity(snack.getQuantity() - 1);
        } else if (nextHandler != null) {
            nextHandler.dispense(snack, insertedMoney);
        }
    }
}