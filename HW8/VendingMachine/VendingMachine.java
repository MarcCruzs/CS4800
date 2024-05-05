package HW8.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private StateOfVendingMachine currentState;
    private Map<String, Snack> snacks;
    private double currentAmount;
    private Snack currentSnack;

    public VendingMachine() {
        currentState = new IdleState();
        snacks = new HashMap<>();
        currentAmount = 0.0;
    }

    public void setState(StateOfVendingMachine state) {
        currentState = state;
    }

    public StateOfVendingMachine getState() {
        return currentState;
    }

    public void addSnack(Snack snack) {
        snacks.put(snack.getName(), snack);
    }

    public Snack getSnack(String snackName) {
        return snacks.get(snackName);
    }

    public void selectSnack(String snackName) {
        currentState.selectSnack(this, snackName);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(this, amount);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack(this);
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setCurrentAmount(double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public Snack getCurrentSnack() {
        return currentSnack;
    }

    public void setCurrentSnack(Snack currentSnack) {
        this.currentSnack = currentSnack;
    }
}