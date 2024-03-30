package tests;

import decoratorcode.*;
import org.junit.Test;
import static org.junit.Assert.*;


public class RestaurantTest {

    @Test
    public void testBaseFoodItem() {
        FoodItem sushi = new BaseFoodItem("Sushi", 10.0);
        assertEquals(10.0, sushi.getCost(), 0.01);
    }

    @Test
    public void testAdditionalTopping() {
        FoodItem sushi = new BaseFoodItem("Sushi", 10.0);
        FoodItem topping = new AdditionalTopping(sushi, "Soy Sauce", 2.0);
        assertEquals(12.0, topping.getCost(), 0.01);
    }

    @Test
    public void testOrder() {
        Order order = new Order();
        FoodItem sushi = new BaseFoodItem("Sushi", 10.0);
        FoodItem topping = new BaseFoodItem("Imitation Crab", 4.5);
        order.addItem(sushi);
        order.addItem(topping);
        assertEquals(14.5, order.calculateTotalCost(), 0.01);
    }

    @Test
    public void testLoyaltyStatus() {
        LoyaltyStatus loyaltyStatus = new LoyaltyStatus(0.1);
        assertEquals(90.0, loyaltyStatus.applyDiscount(100.0), 0.01);
    }
}
