package HW5.Decorator;

public class Driver {
    public static void main(String[] args) {
        // Initializing FoodItems
        Item burger = new FoodItem(5.00);
        Item pizza1 = new FoodItem(3.00);
        Item pizza2 = new FoodItem(3.00);
        Item friedRice = new FoodItem(4.00);
        /*
        Add-ons / Toppings:
            ExtraEgg = $2.00
            ExtraPepperoni = 1.50
            ExtraKimchi = 2.00
            ExtraKimchi = 3.75
         */
        burger = new ItemWithExtraEgg(burger);

        pizza1 = new ItemWithExtraPepperoni(pizza1);

        pizza2 = new ItemWithExtraPineapple(pizza2);

        friedRice = new ItemWithExtraEgg(friedRice);
        friedRice = new ItemWithExtraKimchi(friedRice);

        /*
        Total Cost of Food item and add-ons:
            burger = $7.00
            pizza1 = $4.50
            pizza2 = $5.00
            friedRice = $9.75
         */

        // Initializing Customer orders
        CustomerOrder billsOrder = new CustomerOrder();
        CustomerOrder johnsOrder = new CustomerOrder();
        CustomerOrder smithsOrder = new CustomerOrder();

        billsOrder.addItemToOrder(burger);
        billsOrder.addItemToOrder(pizza1); // Bills Order full cost = $11.50

        johnsOrder.addItemToOrder(friedRice); // Johns Order full cost = $9.75

        smithsOrder.addItemToOrder(pizza1);
        smithsOrder.addItemToOrder(pizza2);
        smithsOrder.addItemToOrder(friedRice); // Smiths Order full Cost = $19.25


        //Apply Discounts to Customer order if any
        /*
        Loyalty Discounts:
            Default = 0%
            Low = 10%
            Medium = 20%
            High = 30%
         */
        billsOrder = new ApplyMediumLoyaltyDiscount(billsOrder);
        smithsOrder = new ApplyHighLoyaltyDiscount(smithsOrder);


        System.out.println("Total Cost of Bill's order: $" + billsOrder.calculateTotalCost());
        System.out.println("Bill's loyalty status: " + billsOrder.getLoyaltyStatus());

        System.out.println("\nTotal Cost of John's order: $" + johnsOrder.calculateTotalCost());
        System.out.println("John's loyalty status: " + johnsOrder.getLoyaltyStatus());

        System.out.println("\nTotal Cost of Smith's order: $" + smithsOrder.calculateTotalCost());
        System.out.println("Smith's loyalty status: " + smithsOrder.getLoyaltyStatus());


    }
}
