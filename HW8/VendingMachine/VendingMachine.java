package HW8.VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    private StateOfVendingMachine currentState;
    private Map<String, Snack> snacks = new HashMap<>();
    private double amountInserted;

    public VendingMachine() {
        currentState = new IdleState(this);
    }

    public void selectSnack(String snack) {
        currentState.selectSnack(snack);
    }

    public void insertMoney(double amount) {
        currentState.insertMoney(amount);
    }

    public void dispenseSnack() {
        currentState.dispenseSnack();
    }

    public void setCurrentState(StateOfVendingMachine currentState) {
        this.currentState = currentState;
    }

    public void addSnack(Snack snack) {
        snacks.put(snack.getName(), snack);
    }

    public StateOfVendingMachine getIdleState() {
        return new IdleState(this);
    }

    public StateOfVendingMachine getWaitingForMoneyState() {
        return new WaitingForMoneyState(this);
    }

    public StateOfVendingMachine getDispensingSnackState() {
        return new DispensingSnackState(this);
    }

    public Map<String, Snack> getSnacks() {
        return snacks;
    }

    public void setAmountInserted(double amountInserted) {
        this.amountInserted = amountInserted;
    }

    public double getAmountInserted() {
        return amountInserted;
    }

    public String getSelectedSnack() {
        currentState.getSelectedSnack();
    }
}