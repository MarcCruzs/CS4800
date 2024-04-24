package HW7.flyweight;

class ColorProperty implements CharacterProperty {
    private String color;

    public ColorProperty(String color) {
        this.color = color;
    }

    public void apply() {
        System.out.println("Applying color: " + color);
    }

    @Override
    public String toString() {
        return "" + color;
    }
}
