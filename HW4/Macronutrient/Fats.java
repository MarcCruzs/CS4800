package HW4.Macronutrient;

public interface Fats {
    String getName();
}

class Avocado implements Fats {
    @Override
    public String getName() {
        return "Avocado";
    }
}

class SourCream implements Fats {
    @Override
    public String getName() {
        return "Sour Cream";
    }
}

class Tuna implements Fats {
    @Override
    public String getName() {
        return "Tuna";
    }
}


