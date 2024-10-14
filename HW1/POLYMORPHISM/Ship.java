package POLYMORPHISM;

public class Ship {
    protected String shipName;
    protected String yearBuilt;

    /**
     * This constructs the Ship class with name and year build attributes
     * @param shipName          The name of the ship
     * @param yearBuilt         The year the ship was built
     */
    public Ship(String shipName, String yearBuilt) {
        this.shipName = shipName;
        this.yearBuilt = yearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public String getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(String yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public void printInfo(){
        System.out.println("Ship Name: " + this.shipName);
        System.out.println("Year Built: " + this.yearBuilt + "\n");
    }
}
