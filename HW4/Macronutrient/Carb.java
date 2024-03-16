package HW4.Macronutrient;

public abstract class Carb {
    private String name;

    public Carb(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Cheese extends Carb {
    public Cheese() {
        super("Cheese");
    }
}

class Bread extends Carb {
    public Bread() {
        super("Bread");
    }
}

class Lentils extends Carb {
    public Lentils() {
        super("Lentils");
    }
}

class Pistachio extends Carb {
    public Pistachio() {
        super("Pistachio");
    }
}
