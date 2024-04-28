package HW7.flyweight;

public class SizeProperty implements CharacterProperty {
    private int size;

    public SizeProperty(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "" + size;
    }
}
