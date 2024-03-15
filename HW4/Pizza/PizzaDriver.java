package HW4.Pizza;
public class PizzaDriver {
    public static void main(String[] args) {
        // TASK 1
        Pizza pizza1 = new PizzaBuilder("small","")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .build();

        Pizza pizza2 = new PizzaBuilder("Medium", "")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.BACON)
                .addTopping(Topping.ONIONS)
                .addTopping(Topping.EXTRA_CHEESE)
                .build();

        Pizza pizza3 = new PizzaBuilder("Large", "")
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.CHICKEN)
                .addTopping(Topping.OLIVES)
                .addTopping(Topping.SPINACH)
                .addTopping(Topping.TOMATO_AND_BASIL)
                .addTopping(Topping.BEEF)
                .addTopping(Topping.HAM)
                .addTopping(Topping.PESTO)
                .addTopping(Topping.SPICY_PORK)
                .build();

        // TASK 2
        // Pizza Hut Pizzas
        Pizza pizza4 = new PizzaBuilder("Large", "Pizza Hut")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .build();

        Pizza pizza5 = new PizzaBuilder("Small", "Pizza Hut")
                .addTopping(Topping.BACON)
                .addTopping(Topping.EXTRA_CHEESE)
                .build();

        // Little Caesars Pizzas
        Pizza pizza6 = new PizzaBuilder("Medium", "Little Caesars")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.BACON)
                .addTopping(Topping.ONIONS)
                .addTopping(Topping.EXTRA_CHEESE)
                .addTopping(Topping.PEPPERS)
                .addTopping(Topping.CHICKEN)
                .build();

        Pizza pizza7 = new PizzaBuilder("Small", "Little Caesars")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.MUSHROOMS)
                .addTopping(Topping.BACON)
                .addTopping(Topping.ONIONS)
                .addTopping(Topping.EXTRA_CHEESE)
                .build();

        Pizza pizza8 = new PizzaBuilder("Small", "Dominos")
                .addTopping(Topping.BACON)
                .build();

        Pizza pizza9 = new PizzaBuilder("Large", "Dominos")
                .addTopping(Topping.PEPPERONI)
                .addTopping(Topping.SAUSAGE)
                .addTopping(Topping.ONIONS)
                .build();

        // All the pizza's "eaten"
        System.out.println("TASK 1");
        pizza1.eat();
        pizza2.eat();
        pizza3.eat();

        System.out.println("TASK 2");

        System.out.println("Pizza Hut Pizzas:");
        pizza4.eat();;
        pizza5.eat();;

        System.out.println("Little Caesars Pizzas:");
        pizza6.eat();;
        pizza7.eat();;

        System.out.println("Dominos Pizzas:");
        pizza8.eat();;
        pizza9.eat();;
    }
}

