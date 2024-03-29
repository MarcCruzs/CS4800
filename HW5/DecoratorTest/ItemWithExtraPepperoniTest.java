package HW5.DecoratorTest;

import HW5.Decorator.FoodItem;
import HW5.Decorator.Item;
import HW5.Decorator.ItemWithExtraEgg;
import HW5.Decorator.ItemWithExtraPepperoni;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemWithExtraPepperoniTest {

    @Test
    void getCost() {
        Item foodItem = new FoodItem(12.0);
        foodItem = new ItemWithExtraPepperoni(foodItem);
        assertEquals(13.50, foodItem.getCost());
    }
}