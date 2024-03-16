package Assignment4.Q2.macronutrient;

public class Carbs implements Macronutrient {
    private String name;

    public Carbs(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Carbs: " + name;
    }
}
