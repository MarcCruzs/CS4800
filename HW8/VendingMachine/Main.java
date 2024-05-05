package HW8.VendingMachine;

import HW8.VendingMachine.Handlers.*;

public class Main {
    public static void main(String[] args) {
        // Creating the Vending Machine
        VendingMachine vendingMachine = new VendingMachine();

        // Setting up the Chain of Responsibility
        SnackDispenseHandler cokeHandler = new CokeHandler(vendingMachine);
        SnackDispenseHandler pepsiHandler = new PepsiHandler(vendingMachine);
        SnackDispenseHandler cheetosHandler = new CheetosHandler(vendingMachine);
        SnackDispenseHandler doritosHandler = new DoritosHandler(vendingMachine);
        SnackDispenseHandler kitKatHandler = new KitKatHandler(vendingMachine);
        SnackDispenseHandler snickersHandler = new SnickersHandler(vendingMachine);

        // Connecting the chain
        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(cheetosHandler);
        cheetosHandler.setNextHandler(doritosHandler);
        doritosHandler.setNextHandler(kitKatHandler);
        kitKatHandler.setNextHandler(snickersHandler);

        // Adding snacks to the vending machine and testing the chain
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.5);
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());

        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(1.5);
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());

        vendingMachine.selectSnack("Cheetos");
        vendingMachine.insertMoney(2.0); // Inserting enough money
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());

        vendingMachine.selectSnack("Doritos");
        vendingMachine.insertMoney(2.0); // Inserting enough money
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());

        vendingMachine.selectSnack("KitKat");
        vendingMachine.insertMoney(1.0); // Inserting enough money
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());

        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.0); // Inserting enough money
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());

        // Attempting to dispense Snickers again (quantity should be 0)
        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(1.0); // Inserting enough money
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());
    }
}

