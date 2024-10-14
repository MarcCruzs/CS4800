package POLYMORPHISM;

public class Test {
    public static void main(String[] args) {

        Ship[] shipArray = {
                new Ship("Abraham", "1998"),
                new CruiseShip("Burlington", "2013",3000),
                new CargoShip("Charles","2000",220000)
        };
        System.out.println("Print Functions:");
        for (int i = 0; i < shipArray.length; i++) {
            shipArray[i].printInfo();
        }
    }
}
