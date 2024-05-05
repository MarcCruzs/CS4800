package HW8.VendingMachine;

public class Main {
    public static void main(String[] args) {
        // Creating the Vending Machine
        VendingMachine vendingMachine = new VendingMachine();

        // Setting up the Chain of Responsibility
        SnackDispenseHandler cokeHandler = new CokeHandler();
        SnackDispenseHandler pepsiHandler = new PepsiHandler();
        SnackDispenseHandler cheetosHandler = new CheetosHandler();
        SnackDispenseHandler doritosHandler = new DoritosHandler();
        SnackDispenseHandler kitKatHandler = new KitKatHandler();
        SnackDispenseHandler snickersHandler = new SnickersHandler();

        // Connecting the chain
        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(cheetosHandler);
        cheetosHandler.setNextHandler(doritosHandler);
        doritosHandler.setNextHandler(kitKatHandler);
        kitKatHandler.setNextHandler(snickersHandler);

        // Adding snacks to the vending machine and testing the chain
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(1.5); // Inserting enough money
        cokeHandler.dispense(vendingMachine.getSelectedSnack(), vendingMachine.getInsertedMoney());

        vendingMachine.selectSnack("Pepsi");
        vendingMachine.insertMoney(1.5); // Inserting enough money
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

