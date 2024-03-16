package Assignment4.Q2.factory;

import Assignment4.Q2.macronutrient.Macronutrient;
import Assignment4.Q2.model.Customer;

public interface MacronutrientFactory {
    Macronutrient create(Customer customer);
}
