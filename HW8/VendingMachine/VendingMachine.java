package HW8.VendingMachine;

import java.util.HashMap;

public class VendingMachine {
    private StateOfVendingMachine currentState;
    private StateOfVendingMachine idleState;
    private StateOfVendingMachine waitingForMoneyState;
    private StateOfVendingMachine dispensingSnackState;
    private HashMap<String, Snack> snacks;
    private String selectedSnack;
    private double insertedMoney;

    public VendingMachine() {
        idleState = new IdleState(this);
        waitingForMoneyState = new WaitingForMoneyState(this);
        dispensingSnackState = new DispensingSnackState(this);
        currentState = idleState;
        snacks = new HashMap<>();
        // Adding initial snacks
        snacks.put("Coke", new Snack("Coke", 1.5, 10));
        snacks.put("Pepsi", new Snack("Pepsi", 1.5, 10));
        snacks.put("Cheetos", new Snack("Cheetos", 2.0, 10));
        snacks.put("Doritos", new Snack("Doritos", 2.0, 10));
        snacks.put("KitKat", new Snack("KitKat", 1.0, 10));
        snacks.put("Snickers", new Snack("Snickers", 1.0, 0)); // Testing zero quantity
    }

    public StateOfVendingMachine getCurrentState() {
        return currentState;
    }

    public void setCurrentState(StateOfVendingMachine currentState) {
        this.currentState = currentState;
    }

    public StateOfVendingMachine getIdleState() {
        return idleState;
    }

    public StateOfVendingMachine getWaitingForMoneyState() {
        return waitingForMoneyState;
    }

    public StateOfVendingMachine getDispensingSnackState() {
        return dispensingSnackState;
    }

    public Snack getSelectedSnack() {
        return snacks.get(selectedSnack);
    }

    public void setSelectedSnack(String selectedSnack) {
        this.selectedSnack = selectedSnack;
    }

    public double getInsertedMoney() {
        return insertedMoney;
    }

    public void setInsertedMoney(double insertedMoney) {
        this.insertedMoney = insertedMoney;
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(snackName);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }
}