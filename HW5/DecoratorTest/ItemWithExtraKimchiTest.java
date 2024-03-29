package HW5.DecoratorTest;

import HW5.Decorator.FoodItem;
import HW5.Decorator.Item;
import HW5.Decorator.ItemWithExtraEgg;
import HW5.Decorator.ItemWithExtraKimchi;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemWithExtraKimchiTest {

    @Test
    void getCost() {
        Item foodItem = new FoodItem(11.0);
        foodItem = new ItemWithExtraKimchi(foodItem);
        assertEquals(14.75, foodItem.getCost());
    }
}