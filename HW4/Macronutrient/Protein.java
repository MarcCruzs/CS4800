package HW4.Macronutrient;

public interface Protein {
    String getName();
}

class Chicken implements Protein {
    @Override
    public String getName() {
        return "Chicken";
    }
}

class Fish implements Protein {
    @Override
    public String getName() {
        return "Fish";
    }
}

class Beef implements Protein {
    @Override
    public String getName() {
        return "Beef";
    }
}
