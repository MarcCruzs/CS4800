package HW8.VendingMachine.Handlers;

import HW8.VendingMachine.IdleState;
import HW8.VendingMachine.Snack;
import HW8.VendingMachine.VendingMachine;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HandlerTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Test
    void processRequest_selectsCheetos() {
        System.setOut(new PrintStream(outputStreamCaptor));
        VendingMachine vendingMachine = new VendingMachine();
        Snack cheetos = new Snack("Cheetos", 1.5, 10);

        vendingMachine.addSnack(cheetos);
        vendingMachine.setState(new IdleState());
        CheetosHandler cheetosHandler = new CheetosHandler(null, vendingMachine);

        cheetosHandler.processRequest("Cheetos", 2.0);

        assertEquals(0.5, vendingMachine.getCurrentAmount());
    }

    @Test
    void processRequest_passesToNextHandler() {
        Handler nextHandler = new DoritosHandler(null, new VendingMachine());
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.setState(new IdleState());
        CheetosHandler cheetosHandler = new CheetosHandler(nextHandler, vendingMachine);

        cheetosHandler.processRequest("Doritos", 2.0);

        assertEquals(0.0, vendingMachine.getCurrentAmount());
        assertEquals(null, vendingMachine.getCurrentSnack());
    }
}
