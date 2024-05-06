package HW8.VendingMachineTest;

import HW8.VendingMachine.IdleState;
import HW8.VendingMachine.Snack;
import HW8.VendingMachine.VendingMachine;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IdleStateTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    private IdleState idleState;
    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        idleState = new IdleState();
        vendingMachine = new VendingMachine();
    }

    @Test
    void selectSnack() {
        Snack snackInStock = new Snack("Chips", 1.5, 10);
        vendingMachine.addSnack(snackInStock);

        idleState.selectSnack(vendingMachine, "Chips");

        assertEquals(snackInStock, vendingMachine.getCurrentSnack());
    }

    @Test
    void selectOutOfStockSnack() {
        Snack outOfStockSnack = new Snack("Soda", 2.0, 0);
        vendingMachine.addSnack(outOfStockSnack);

        idleState.selectSnack(vendingMachine, "Soda");

        assertEquals("Soda is out of stock.", outputStreamCaptor.toString().trim());
    }

    @Test
    void selectUnavailableSnack() {
        idleState.selectSnack(vendingMachine, "Water");

        assertEquals("Water is not available.", outputStreamCaptor.toString().trim());
    }
}
