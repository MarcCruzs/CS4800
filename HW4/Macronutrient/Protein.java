package HW4.Macronutrient;

public abstract class Protein {
    private String name;

    public Protein(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Fish extends Protein {
    public Fish() {
        super("Fish");
    }
}

class Chicken extends Protein {
    public Chicken() {
        super("Chicken");
    }
}

class Beef extends Protein {
    public Beef() {
        super("Beef");
    }
}

class Tofu extends Protein {
    public Tofu() {
        super("Tofu");
    }
}
