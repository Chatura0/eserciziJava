package basic2._3;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        Student student = new Student("Chax Hewa", 23, "Via delle Lellere 2", "Psicologia", false);
        System.out.println("Student name: " + student.getName());
        student.setAddress("Via delle Lellere 2");
        System.out.println("Student address: " + student.getAddress());
        System.out.println("Is student graduated? " + student.isGraduated());
        student.setGraduated(false);
        System.out.println("Is student graduated now? " + student.isGraduated());
    }

    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student student = new Student("Chax Hewa", 23, "Via delle Lellere 2", "Psicologia", false);
        try {
            student.setAge(-1);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        try {
            student.setName(".");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Age getter was called " + student.getGetAgeCounter() + " times.");
    }

}
