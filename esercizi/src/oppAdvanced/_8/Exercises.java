package oppAdvanced._8;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");

        Dog dog = new Dog("Pitbull Amstaff", 50, 25);

        String breed = dog.getBreed();
        double height = dog.getHeight();
        double weight = dog.getWeight();

        System.out.println("Breed: " + breed + "\nHeight: " + height + "\nWeight: " + weight );
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        Fish fish = new Fish("Salmon", 10, 5);
        fish.setSpecies("Trout");
        System.out.println("Fish species: " + fish.getSpecies()+"\nFish height: " + fish.getHeight()+"\nFish weight: " + fish.getWeight());

        Bird bird = new Bird(50, 30, 2);
        bird.setWingSpan(60);
        System.out.println("Bird wing span: " + bird.getWingSpan()+"\nBird height: " + bird.getHeight()+"\nBird weight: " + bird.getWeight());
    }



    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        Dog dog = new Dog("Labrador", 50, 25);
        Fish fish = new Fish("Salmon", 10, 5);
        Bird bird = new Bird(50, 30, 2);

        // Calculate and compare the movement speeds
        double dogSpeed = dog.runSpeedMetersPerSecond();
        double fishSpeed = fish.swimSpeedMetersPerSecond();
        double birdSpeed = bird.flySpeedMetersPerSecond();

        // Print out the fastest animal
        if (dogSpeed > fishSpeed && dogSpeed > birdSpeed) {
            System.out.println("The dog has the fastest movement speed: " + dogSpeed + " m/s");
        } else if (fishSpeed > dogSpeed && fishSpeed > birdSpeed) {
            System.out.println("The fish has the fastest movement speed: " + fishSpeed + " m/s");
        } else if (birdSpeed > dogSpeed && birdSpeed > fishSpeed) {
            System.out.println("The bird has the fastest movement speed: " + birdSpeed + " m/s");
        } else {
            System.out.println("There is a tie in movement speed between the animals.");
        }

    }
}
