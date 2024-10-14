package POLYMORPHISM;

public class CruiseShip extends Ship {
    private int maxPassengerCapacity;

    /**
     * This constructs the CruiseShip class.
     * @param shipName              The name of the ship
     * @param yearBuilt             The year the ship was built
     * @param maxPassengerCapacity  The maximum amount of passengers allowed on the ship
     */
    public CruiseShip(String shipName, String yearBuilt, int maxPassengerCapacity) {
        super(shipName, yearBuilt);
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public int getMaxPassengerCapacity() {
        return maxPassengerCapacity;
    }

    public void setMaxPassengerCapacity(int maxPassengerCapacity) {
        this.maxPassengerCapacity = maxPassengerCapacity;
    }

    public void printInfo(){
        System.out.println("Ship Name: " + super.shipName);
        System.out.println("Year Built: " + super.yearBuilt);
        System.out.println("Maximum Amount of Passengers: " + this.maxPassengerCapacity + "\n");
    }
}
