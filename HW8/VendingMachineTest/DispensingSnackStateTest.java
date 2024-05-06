package HW8.VendingMachineTest;

import HW8.VendingMachine.DispensingSnackState;
import HW8.VendingMachine.Snack;
import HW8.VendingMachine.VendingMachine;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DispensingSnackStateTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    private VendingMachine vendingMachine;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
        vendingMachine = new VendingMachine();
        vendingMachine.setState(new DispensingSnackState());
    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void selectSnack() {
        vendingMachine.selectSnack("Chips");
        assertTrue(vendingMachine.getState() instanceof DispensingSnackState);
    }

    @Test
    void insertMoney() {
        vendingMachine.insertMoney(1.0);
        assertTrue(vendingMachine.getState() instanceof DispensingSnackState);
    }

    @Test
    void dispenseSnack() {
        Snack snack = new Snack("Chips", 1, 1);
        vendingMachine.setCurrentSnack(snack);
        vendingMachine.dispenseSnack();
        assertEquals("Dispencing Chips", outputStreamCaptor.toString().trim());
    }
}
