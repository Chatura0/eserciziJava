package oppAdvanced._10;

import java.util.Set;

class Meal {
    private double price;
    private int calories;
    private Set<String> ingredients;

    public Meal(double price, int calories, Set<String> ingredients) {
        this.price = price;
        this.calories = calories;
        this.ingredients = ingredients;
    }

    // Getters and setters ommitted for brevity

    @Override
    public String toString() {
        return "Meal{" +
                "price=" + price +
                ", calories=" + calories +
                ", ingredients=" + ingredients +
                '}';
    }
}
