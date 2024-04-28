package HW7.flyweight;

public class ColorProperty implements CharacterProperty {
    private String color;

    public ColorProperty(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "" + color;
    }
}
