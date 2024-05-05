package HW8.VendingMachine;

public interface StateOfVendingMachine {
    void selectSnack(String snack);
    void insertMoney(double amount);
    void dispenseSnack();
}

