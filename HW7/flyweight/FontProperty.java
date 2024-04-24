package HW7.flyweight;

class FontProperty implements CharacterProperty {
    private String font;

    public FontProperty(String font) {
        this.font = font;
    }

    public void apply() {
        System.out.println("Applying font: " + font);
    }

    @Override
    public String toString() {
        return "" + font;
    }
}