package HW4.Pizza;
public class PizzaBuilder {
    private Pizza pizza;

    public PizzaBuilder(String size, String chain) {
        this.pizza = new Pizza(size, chain);
    }

    public PizzaBuilder addTopping(Topping topping) {
        pizza.addTopping(topping);
        return this;
    }

    public Pizza build() {
        return pizza;
    }
}
