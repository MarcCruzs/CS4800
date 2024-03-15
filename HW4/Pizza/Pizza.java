package HW4.Pizza;

import java.util.ArrayList;
import java.util.List;

enum Topping {
    PEPPERONI, SAUSAGE, MUSHROOMS, BACON, ONIONS, EXTRA_CHEESE, PEPPERS, CHICKEN,
    OLIVES, SPINACH, TOMATO_AND_BASIL, BEEF, HAM, PESTO, SPICY_PORK, HAM_AND_PINEAPPLE
}

public class Pizza {
    private List<Topping> toppings;
    private String size;
    private String chain;

    public Pizza(String size, String chain) {
        this.size = size;
        this.chain = chain;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping)
    {
        toppings.add(topping);
    }

    public void eat() {
        System.out.println(chain + " " + size + " pizza with " + toppings.size() + " toppings:");
        System.out.println("Toppings: " + toppings);
        System.out.println("Enjoy your meal!");
        System.out.println();
    }
}
