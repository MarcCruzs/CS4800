package HW7.flyweight;

class Character {
    private char character;
    private CharacterProperty font;
    private CharacterProperty color;
    private CharacterProperty size;

    public Character(char character, CharacterProperty font, CharacterProperty color, CharacterProperty size) {
        this.character = character;
        this.font = font;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Character: " + character +
                ", Font: " + getPropertyValue(font) +
                ", Color: " + getPropertyValue(color) +
                ", Size: " + getPropertyValue(size);
    }

    private String getPropertyValue(CharacterProperty property) {
        if (property instanceof FontProperty) {
            return ((FontProperty) property).toString();
        } else if (property instanceof ColorProperty) {
            return ((ColorProperty) property).toString();
        } else if (property instanceof SizeProperty) {
            return String.valueOf(((SizeProperty) property));
        }
        return "Unknown Property";
    }
}
