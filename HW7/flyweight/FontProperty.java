package HW7.flyweight;

public class FontProperty implements CharacterProperty {
    private String font;

    public FontProperty(String font) {
        this.font = font;
    }

    @Override
    public String toString() {
        return "" + font;
    }
}