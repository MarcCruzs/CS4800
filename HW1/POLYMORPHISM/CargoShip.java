package POLYMORPHISM;

public class CargoShip extends Ship{
    private int maxCargoCapacity;

    /**
     * This constructs the CargoShip class.
     * @param shipName              The name of the ship
     * @param yearBuilt             The year the ship was built
     * @param maxCargoCapacity      The maximum amount of cargo allowed in Tons
     */
    public CargoShip(String shipName, String yearBuilt, int maxCargoCapacity) {
        super(shipName, yearBuilt);
        this.maxCargoCapacity = maxCargoCapacity;
    }

    public int getMaxCargoCapacity() {
        return maxCargoCapacity;
    }

    public void setMaxCargoCapacity(int maxCargoCapacity) {
        this.maxCargoCapacity = maxCargoCapacity;
    }

    public void printInfo(){
        System.out.println("Ship Name: " + super.shipName);
        System.out.println("Year Built: " + super.yearBuilt);
        System.out.println("Maximum Amount of Cargo in Tons: " + this.maxCargoCapacity + "\n");
    }
}
