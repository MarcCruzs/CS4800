package HW8.VendingMachine;

public class Main {
    public static void main(String[] args) {
        // Create snacks
        Snack coke = new Snack("Coke", 1.5, 5);
        Snack pepsi = new Snack("Pepsi", 1.5, 3);
        Snack cheetos = new Snack("Cheetos", 2, 4);
        Snack doritos = new Snack("Doritos", 2, 2);
        Snack kitKat = new Snack("KitKat", 1.2, 3);
        Snack snickers = new Snack("Snickers", 1.8, 0); // Quantity hits 0 here

        // Create vending machine
        VendingMachine vendingMachine = new VendingMachine();

        // Add snacks to vending machine
        vendingMachine.addSnack(coke);
        vendingMachine.addSnack(pepsi);
        vendingMachine.addSnack(cheetos);
        vendingMachine.addSnack(doritos);
        vendingMachine.addSnack(kitKat);
        vendingMachine.addSnack(snickers);

        // Create chain of responsibility
        SnackDispenseHandler cokeHandler = new SnackDispenseHandler(vendingMachine.getSnacks());
        SnackDispenseHandler pepsiHandler = new SnackDispenseHandler(vendingMachine.getSnacks());
        SnackDispenseHandler cheetosHandler = new SnackDispenseHandler(vendingMachine.getSnacks());
        SnackDispenseHandler doritosHandler = new SnackDispenseHandler(vendingMachine.getSnacks());
        SnackDispenseHandler kitKatHandler = new SnackDispenseHandler(vendingMachine.getSnacks());
        SnackDispenseHandler snickersHandler = new SnackDispenseHandler(vendingMachine.getSnacks());

        cokeHandler.setNextHandler(pepsiHandler);
        pepsiHandler.setNextHandler(cheetosHandler);
        cheetosHandler.setNextHandler(doritosHandler);
        doritosHandler.setNextHandler(kitKatHandler);
        kitKatHandler.setNextHandler(snickersHandler);

        // Select and dispense snacks
        vendingMachine.selectSnack("Coke");
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();

        vendingMachine.selectSnack("Snickers");
        vendingMachine.insertMoney(2);
        vendingMachine.dispenseSnack();
    }
}

