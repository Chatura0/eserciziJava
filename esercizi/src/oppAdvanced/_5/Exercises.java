package oppAdvanced._5;

import java.nio.file.Files;
import java.nio.file.Path;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Uncomment the Files.createFile() line below and write a try catch block that
     *    prints its stack trace
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        try {
            if (!Files.exists(Path.of("Test.txt"))) {
                Files.createFile(Path.of("Test.txt"));
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
        }
    }

    /**
     * 2:
     *
     * Write a try-catch block that attempts to open a file
     *
     * In the catch block, print a message that informs the user that the file could not be found.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            Files.readString(Path.of("nonexistent-file.txt"));
        } catch (Exception exception) {
            System.err.println("File could not be found.");
        }
    }

    /**
     * 3:
     *
     * Write a try-catch block that attempts to parse a string as an integer.
     *
     * In the catch block, print a message that informs the user that the input was not a valid integer.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        try {
            Integer.parseInt("house");
        } catch (NumberFormatException exception) {
            System.err.println("Input was not a valid integer.");
        }
    }

    /**
     * 4:
     *
     * Write a try block that wraps this print statement and attempts to divide 2 numbers
     *
     * Create multiple catch blocks that catch different types of exceptions, such as NumberFormatException and ArithmeticException.
     *
     * In each catch block, print a message that informs the user of the specific exception that was caught and why it occurred.
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        Double num1 = 10.0;
        String num2AsString = "0.0";
        try {
            System.out.println(num1 / Double.parseDouble(num2AsString));
        } catch (NumberFormatException exception) {
            System.err.println("Input was not a valid number.");
        } catch (ArithmeticException exception) {
            System.err.println("Cannot divide by zero.");
        }
    }
}
