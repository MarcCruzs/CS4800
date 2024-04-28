package HW7.flyweightTest;


import HW7.flyweight.CharacterProperty;
import HW7.flyweight.CharacterPropertyFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CharacterPropertyFactoryTest {

    private CharacterPropertyFactory factory;

    @BeforeEach
    void setUp() {
        factory = new CharacterPropertyFactory();
    }

    @Test
    void getFont() {
        CharacterProperty font1 = factory.getFont("Arial");
        CharacterProperty font2 = factory.getFont("Arial");
        CharacterProperty font3 = factory.getFont("Times New Roman");

        assertSame(font1, font2);
        assertNotSame(font1, font3);
    }

    @Test
    void getColor() {
        CharacterProperty color1 = factory.getColor("Red");
        CharacterProperty color2 = factory.getColor("Red");
        CharacterProperty color3 = factory.getColor("Blue");

        assertSame(color1, color2);
        assertNotSame(color1, color3);
    }

    @Test
    void getSize() {
        CharacterProperty size1 = factory.getSize(12);
        CharacterProperty size2 = factory.getSize(12);
        CharacterProperty size3 = factory.getSize(16);

        assertSame(size1, size2);
        assertNotSame(size1, size3);
    }
}