package HW5.DecoratorTest;

import HW5.Decorator.FoodItem;
import HW5.Decorator.Item;
import HW5.Decorator.ItemWithExtraEgg;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemWithExtraEggTest {

    @Test
    void getCost() {
        Item foodItem = new FoodItem(10.0);
        foodItem = new ItemWithExtraEgg(foodItem);
        assertEquals(12.0, foodItem.getCost());
    }
}