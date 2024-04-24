package HW7.flyweight;

import java.util.HashMap;
import java.util.Map;

// Flyweight Factory to manage character properties
class CharacterPropertyFactory {
    private Map<String, CharacterProperty> properties = new HashMap<>();

    public CharacterProperty getFont(String font) {
        return properties.computeIfAbsent(font, FontProperty::new);
    }

    public CharacterProperty getColor(String color) {
        return properties.computeIfAbsent(color, ColorProperty::new);
    }

    public CharacterProperty getSize(int size) {
        String key = String.valueOf(size);
        return properties.computeIfAbsent(key, s -> new SizeProperty(size));
    }
}

