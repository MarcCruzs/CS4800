package HW5.DecoratorTest;

import HW5.Decorator.FoodItem;
import HW5.Decorator.Item;
import HW5.Decorator.ItemWithExtraEgg;
import HW5.Decorator.ItemWithExtraPineapple;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemWithExtraPineappleTest {

    @Test
    void getCost() {
        Item foodItem = new FoodItem(10.0);
        foodItem = new ItemWithExtraPineapple(foodItem);
        assertEquals(12.0, foodItem.getCost());
    }
}