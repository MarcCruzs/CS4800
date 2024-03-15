package HW4.Macronutrient;
public class Driver {
    public static void main(String[] args) {
        Customer[] customers = {
                new Customer("John", DietPlan.NO_RESTRICTION),
                new Customer("George", DietPlan.PALEO),
                new Customer("Jim", DietPlan.VEGAN),
                new Customer("Mike", DietPlan.NUT_ALLERGY),
                new Customer("Gilbert", DietPlan.NO_RESTRICTION),
                new Customer("Daniel", DietPlan.VEGAN)
        };

        for (Customer customer : customers) {
            System.out.println(customer.getName() + "'s " + customer.getDietPlan() + " Meal:");
            Meal meal = customer.generateMeal();
            System.out.println(meal);
            System.out.println("---------------------");
        }
    }
}

