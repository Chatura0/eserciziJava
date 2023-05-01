package basic._4;

public class Main {
    public static void main(String[] args) {

    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int age = 23;
        System.out.println("My age is "+age+".");
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        char myInitial = 'C';
        int myAge = 23;
        System.out.println("My Age=" + myAge + ", my initial=" + myInitial);
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        //Stampa una nuova riga e una stringa.
        System.out.println("\nExercise 3:");
        //Dichiara una variabile booleana denominata "hasEatenLunch" e assegna un valore falso
        boolean hasEatenLunch = false;
        //Dichiara una variabile double denominata "lunchCost" e assegna un valore di 5,99
        double lunchCost = 5.99;
        //Stampa la stringa "Lunch cost=" seguita dal valore di "lunchCost"
        System.out.println("Lunch cost=" + lunchCost);
        //Stampa la stringa "Has Eaten lunch=" seguita dal valore di "hasEatenLunch"
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
