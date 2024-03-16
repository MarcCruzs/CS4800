package HW4.Macronutrient;

public abstract class Fat {
    private String name;

    public Fat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Avocado extends Fat {
    public Avocado() {
        super("Avocado");
    }
}

class SourCream extends Fat {
    public SourCream() {
        super("Sour Cream");
    }
}

class Tuna extends Fat {
    public Tuna() {
        super("Tuna");
    }
}

class Peanuts extends Fat {
    public Peanuts() {
        super("Peanuts");
    }
}
