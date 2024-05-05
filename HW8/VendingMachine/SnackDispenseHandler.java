package HW8.VendingMachine;

import java.util.Map;

public class SnackDispenseHandler {
    private Map<String, Snack> snacks;
    private SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(Map<String, Snack> snacks) {
        this.snacks = snacks;
    }

    public void setNextHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void dispenseSnack(String snack) {
        if (snacks.containsKey(snack) && snacks.get(snack).getQuantity() > 0) {
            System.out.println("Dispensing " + snack);
            snacks.get(snack).decreaseQuantity();
        } else if (nextHandler != null) {
            nextHandler.dispenseSnack(snack);
        } else {
            System.out.println("Selected snack is not available.");
        }
    }
}
