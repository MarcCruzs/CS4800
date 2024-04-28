package HW7.flyweightTest;

import HW7.flyweight.ColorProperty;
import HW7.flyweight.FontProperty;
import HW7.flyweight.SizeProperty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FontColorSizePropertyTest {
    private FontProperty fontProperty;
    private ColorProperty colorProperty;
    private SizeProperty sizeProperty;

    @Test
    void fontToString() {
        fontProperty = new FontProperty("Arial");
        assertEquals("Arial", fontProperty.toString());

    }

    @Test
    void colorToString() {
        colorProperty = new ColorProperty("Red");
        assertEquals("Red", colorProperty.toString());
    }

    @Test
    void sizeToString() {
        sizeProperty = new SizeProperty(12);
        assertEquals("12", sizeProperty.toString());
    }
}