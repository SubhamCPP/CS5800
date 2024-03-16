package Assignment4.Q2.meal;

import Assignment4.Q2.factory.*;
import Assignment4.Q2.macronutrient.*;
import Assignment4.Q2.model.Customer;

public class MacronutrientMealFactory {
    private MacronutrientAbstractFactory abstractFactory;

    public MacronutrientMealFactory(MacronutrientAbstractFactory abstractFactory) {
        this.abstractFactory = abstractFactory;
    }

    public MacronutrientMeal createMeal(Customer customer) {
        Carbs carbs = (Carbs) abstractFactory.createCarbsFactory().create(customer);
        Protein protein = (Protein) abstractFactory.createProteinFactory().create(customer);
        Fats fats = (Fats) abstractFactory.createFatsFactory().create(customer);

        return new MacronutrientMeal(carbs, protein, fats);
    }
}
