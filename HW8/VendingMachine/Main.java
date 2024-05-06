package HW8.VendingMachine;

import HW8.VendingMachine.Handlers.CheetosHandler;
import HW8.VendingMachine.Handlers.CokeHandler;
import HW8.VendingMachine.Handlers.*;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();

        // Creating snacks (name, price, quantity)
        Snack coke = new Snack("Coke", 1.5, 5);
        Snack pepsi = new Snack("Pepsi", 1.75, 3);
        Snack cheetos = new Snack("Cheetos", 2.0, 4);
        Snack doritos = new Snack("Doritos", 2.25, 6);
        Snack kitkat = new Snack("KitKat", 1.0, 2);
        Snack snickers = new Snack("Snickers", 1.25, 0);

        // Adding snacks to vending machine
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitkat);
        vendingMachine.addSnack(snickers);

        // Creating SnackDispenseHandler after snacks are added
        Handler chain = new CokeHandler(new PepsiHandler(new CheetosHandler(new DoritosHandler(new KitKatHandler(new SnickersHandler(null, vendingMachine), vendingMachine), vendingMachine), vendingMachine), vendingMachine), vendingMachine);

        // Dispensing snacks
        chain.processRequest("Coke", 2.0);
        chain.processRequest("Pepsi", 1.75);
        chain.processRequest("Cheetos", 2.0);
        chain.processRequest("Doritos", 2.5);
        chain.processRequest("KitKat", 1.0);
        chain.processRequest("Snickers", 1.5); // Out of stock
    }
}

