package HW7.flyweight;

class SizeProperty implements CharacterProperty {
    private int size;

    public SizeProperty(int size) {
        this.size = size;
    }

    public void apply() {
        System.out.println("Applying size: " + size);
    }

    @Override
    public String toString() {
        return "" + size;
    }
}
