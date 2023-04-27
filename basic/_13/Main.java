package javabasics._13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(7);
        numbers.add(2);
        numbers.add(1);
        numbers.add(9);
        numbers.add(6);
        numbers.add(4);
        numbers.add(8);

        System.out.println("First item: " + numbers.get(0));

        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);

        System.out.println("First remaining item: " + numbers.get(0));
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();

        menuItems.add("Hamburger");
        menuPrices.add(8.99);
        menuItems.add("Cheeseburger");
        menuPrices.add(9.99);
        menuItems.add("Fries");
        menuPrices.add(3.99);
        menuItems.add("Onion Rings");
        menuPrices.add(4.99);

        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(menuItems.get(i) + " - $" + menuPrices.get(i));
        }
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        int total = 0;
        for (int i = 0; i < items.length; i++) {
            total += items[i];
        }

        System.out.println("Total sum: " + total);
    }
}
