package HW8.VendingMachine;

public interface StateOfVendingMachine {
    void selectSnack(String snackName);
    void insertMoney(double amount);
    void dispenseSnack();
}
