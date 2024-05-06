package HW8.VendingMachineTest;

import HW8.VendingMachine.Snack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SnackTest {
    private Snack snack;

    @BeforeEach
    void setUp() {
        snack = new Snack("Chips", 1.5, 10);
    }

    @Test
    void getName() {
        assertEquals("Chips", snack.getName());
    }

    @Test
    void getPrice() {
        assertEquals(1.5, snack.getPrice());
    }

    @Test
    void getQuantity() {
        assertEquals(10, snack.getQuantity());
    }

    @Test
    void setQuantity() {
        snack.setQuantity(5);
        assertEquals(5, snack.getQuantity());
    }
}
