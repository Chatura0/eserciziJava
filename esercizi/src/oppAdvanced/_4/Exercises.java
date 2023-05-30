package oppAdvanced._4;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Exercises {

    private static final Path MY_PATH = Paths.get("file.txt");
    private static final Path PATH_IN_A_FOLDER = Paths.get("mydirectory/file.txt");

    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    /**
     * 1:
     * Write a method that writes myString to a file
     * writes to a file
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        String myString = """
                The quick brown fox jumps over the lazy dog
                """;

        try {
            Files.writeString(MY_PATH, myString);
            System.out.println("File written successfully.");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 2:
     * Write a method that reads the file from exercise 1
     * then prints it out
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        try {
            String fileContent = Files.readString(MY_PATH);
            System.out.println(fileContent);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 3:
     * Write a method that reads a file and print the number of lines in the file
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Write code here to read the file and return the number of lines "\n", string.split

        try {
            List<String> lines = Files.readAllLines(MY_PATH);
            int numberOfLines = lines.size();
            System.out.println("Number of lines: " + numberOfLines);
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 4:
     * Write a method that reads a file and returns the number of words in the file
     *
     * Then deletes the previous file with Files.delete() use inside the try block
     *
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        try {
            String fileContent = Files.readString(MY_PATH);
            String[] words = fileContent.split("\\s+");
            int numberOfWords = words.length;
            System.out.println("Number of words: " + numberOfWords);

            Files.delete(MY_PATH);
            System.out.println("File deleted successfully.");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }

    /**
     * 5:
     * Using the `myDirectoryPath` and Files.createDirectory, fix the code below
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        Path myDirectoryPath = Path.of("mydirectory");

        try {
            if (!Files.exists(myDirectoryPath)) {
                Files.createDirectories(myDirectoryPath);
                System.out.println("Directory created.");
            } else {
                System.out.println("Directory already exists.");
            }

            Path filePathInDirectory = myDirectoryPath.resolve("file.txt");
            Files.writeString(filePathInDirectory, "Why am I in a folder?");
            System.out.println("File written in directory.");
        } catch (Exception exception) {
            System.err.println("There was an error!");
            exception.printStackTrace();
            System.exit(0);
        }
    }
}
