package HW8.VendingMachineTest;

import HW8.VendingMachine.Snack;
import HW8.VendingMachine.VendingMachine;
import HW8.VendingMachine.WaitingForMoneyState;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class WaitingForMoneyStateTest {
    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        vendingMachine = new VendingMachine();
        vendingMachine.setCurrentSnack(new Snack("Chips", 1.5, 10));
        vendingMachine.selectSnack("Chips");
    }

    @Test
    void insertMoney_sufficientFunds() {
        double amount = 2.0;
        vendingMachine.insertMoney(amount);
        assertEquals(0.0, vendingMachine.getCurrentAmount());
    }

    @Test
    void insertMoney_insufficientFunds() {
        double amount = 1.0;
        vendingMachine.insertMoney(amount);
        assertEquals(0.0, vendingMachine.getCurrentAmount());
    }

    @Test
    void dispenseSnack() {
        vendingMachine.dispenseSnack();
        assertEquals(0.0, vendingMachine.getCurrentAmount());
    }
}
