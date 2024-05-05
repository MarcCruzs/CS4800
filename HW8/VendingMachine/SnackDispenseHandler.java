package HW8.VendingMachine;

interface SnackDispenseHandler {
    void setNextHandler(SnackDispenseHandler handler);
    void dispense(Snack snack, double insertedMoney);
}
