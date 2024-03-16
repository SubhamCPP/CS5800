package Assignment4.Q1;
import Assignment4.Q1.Pizza;
import Assignment4.Q1.ConcreteBuilders.*;

public class DirectorDriver {
    public static void main(String[] args) {
        // Pizza Hut
        PizzaHutPizzaBuilder builder2_1_1= new PizzaHutPizzaBuilder();
        builder2_1_1.setSize("Large");
        builder2_1_1.addPepperoni();
        builder2_1_1.addSausage();
        builder2_1_1.addOlives();
        Pizza pizza2_1_1 = builder2_1_1.build();
        pizza2_1_1.eat();

        PizzaHutPizzaBuilder builder2_1_2= new PizzaHutPizzaBuilder();
        builder2_1_2.setSize("Small");
        builder2_1_2.addChicken();
        builder2_1_2.addPeppers();
        Pizza pizza2_1_2 = builder2_1_2.build();
        pizza2_1_2.eat();

        // Little Caesars
        LittleCaesarsPizzaBuilder builder2_2_1 = new LittleCaesarsPizzaBuilder();
        builder2_2_1.setSize("Medium");
        builder2_2_1.addExtraCheese();
        builder2_2_1.addMushrooms();
        builder2_2_1.addOlives();
        builder2_2_1.addOnions();
        builder2_2_1.addPeppers();
        builder2_2_1.addTomatoAndBasil();
        builder2_2_1.addBeef();
        builder2_2_1.addHam();
        Pizza pizza2_2_1 = builder2_2_1.build();
        pizza2_2_1.eat();

        LittleCaesarsPizzaBuilder builder2_2_2 = new LittleCaesarsPizzaBuilder();
        builder2_2_2.setSize("Small");
        builder2_2_2.addBacon();
        builder2_2_2.addChicken();
        builder2_2_2.addSpicyPork();
        builder2_2_2.addPeppers();
        builder2_2_2.addOnions();
        builder2_2_2.addHamAndPineapple();
        Pizza pizza2_2_2 = builder2_2_2.build();
        pizza2_2_2.eat();


        // Dominos
        DominosPizzaBuilder builder2_3_1 = new DominosPizzaBuilder();
        builder2_3_1.setSize("small");
        builder2_3_1.addHamAndPineapple();
        Pizza pizza2_3_1 = builder2_3_1.build();
        pizza2_3_1.eat();

        DominosPizzaBuilder builder2_3_2 = new DominosPizzaBuilder();
        builder2_3_2.setSize("Large");
        builder2_3_2.addSausage();
        builder2_3_2.addMushrooms();
        builder2_3_2.addOlives();
        Pizza pizza2_3_2 = builder2_3_2.build();
        pizza2_3_2.eat();

    }
}
