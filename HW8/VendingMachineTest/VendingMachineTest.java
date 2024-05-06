package HW8.VendingMachineTest;

import HW8.VendingMachine.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class VendingMachineTest {
    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        vendingMachine = new VendingMachine();
    }

    @Test
    void setState() {
        StateOfVendingMachine newState = new WaitingForMoneyState();
        vendingMachine.setState(newState);
        assertEquals(newState, vendingMachine.getState());
    }

    @Test
    void getState() {
        assertEquals(IdleState.class, vendingMachine.getState().getClass());
    }

    @Test
    void addSnack() {
        Snack snack = new Snack("Chips", 1.5, 10);
        vendingMachine.addSnack(snack);
        assertEquals(snack, vendingMachine.getSnack("Chips"));
    }

    @Test
    void getSnack() {
        assertNull(vendingMachine.getSnack("Chips"));
    }

    @Test
    void selectSnack() {
        Snack snack = new Snack("Chips", 1.5, 10);
        vendingMachine.addSnack(snack);
        vendingMachine.selectSnack("Chips");
        assertEquals(snack, vendingMachine.getCurrentSnack());
    }

    @Test
    void getCurrentAmount() {
        double amount = 2.0;
        vendingMachine.setCurrentAmount(amount);
        assertEquals(amount, vendingMachine.getCurrentAmount());
    }

    @Test
    void setCurrentAmount() {
        double amount = 3.0;
        vendingMachine.setCurrentAmount(amount);
        assertEquals(amount, vendingMachine.getCurrentAmount());
    }

    @Test
    void getCurrentSnack() {
        Snack snack = new Snack("Chips", 1.5, 10);
        vendingMachine.setCurrentSnack(snack);
        assertEquals(snack, vendingMachine.getCurrentSnack());
    }

    @Test
    void setCurrentSnack() {
        Snack snack = new Snack("Chips", 1.5, 10);
        vendingMachine.setCurrentSnack(snack);
        assertEquals(snack, vendingMachine.getCurrentSnack());
    }

}