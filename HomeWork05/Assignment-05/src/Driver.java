import decoratorcode.*;

// Driver program
public class Driver {
    public static void main(String[] args) {
        // Create food items
        FoodItem sushi = new BaseFoodItem("Sushi", 15.0);
        FoodItem riceCake = new BaseFoodItem("Rice Cake", 4.5);

        // Add toppings
        FoodItem sushiWithCrab = new AdditionalTopping(sushi, "Imitation Crab", 4.5);
        FoodItem sushiWithCrabCrunchy = new AdditionalTopping(sushiWithCrab, "Crunchy", 2.5);

        // Create order
        Order order = new Order();
        order.addItem(sushiWithCrabCrunchy);
        order.addItem(riceCake);

        // Calculate total cost
        double totalCost = order.calculateTotalCost();
        System.out.println("Total cost before discount: $" + totalCost);

        // Apply discount based on loyalty status
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1); // 10% discount for example
        double discountedCost = loyaltyStatus.applyDiscount(totalCost);
        System.out.println("Total cost after discount: $" + discountedCost);
    }
}
