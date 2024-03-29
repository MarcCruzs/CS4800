package HW5.DecoratorTest;

import HW5.Decorator.FoodItem;
import HW5.Decorator.Item;
import HW5.Decorator.ItemWithExtraKimchi;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FoodItemTest {
    private Item foodItem;

    @BeforeEach
    void setUp() {
        foodItem = new FoodItem(10.0);
    }

    @Test
    void addTopping() {
        foodItem = new ItemWithExtraKimchi(foodItem);
        assertEquals(13.75, foodItem.getCost());
    }

    @Test
    void getCost() {
        assertEquals(10.0, foodItem.getCost());
    }
}