package oppAdvanced._6;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");

        enum Days {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        for (Days day : Days.values()) {
            System.out.println(day);
        }
    }

    /**
     * 2:
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");

        enum Seasons {
            SPRING("March - May"),
            SUMMER("June - August"),
            FALL("September - November"),
            WINTER("December - February");

            private final String dateRange;

            Seasons(String dateRange) {
                this.dateRange = dateRange;
            }

            public String getDateRange() {
                return dateRange;
            }
        }

        Seasons season = Seasons.SUMMER;
        System.out.println(season.getDateRange());
    }

    /**
     * 3:
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");

        enum TrafficLight {
            RED,
            YELLOW,
            GREEN;

            public TrafficLight getNextState() {
                switch (this) {
                    case RED:
                        return GREEN;
                    case YELLOW:
                        return RED;
                    case GREEN:
                        return YELLOW;
                    default:
                        return RED;
                }
            }
        }

        TrafficLight currentLight = TrafficLight.RED;
        TrafficLight nextLight = currentLight.getNextState();
        System.out.println("Current Light: " + currentLight);
        System.out.println("Next Light: " + nextLight);
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     * Write an if statement that prints weekend or weekday based on the enum.
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");

        enum Days {
            MONDAY(false),
            TUESDAY(false),
            WEDNESDAY(false),
            THURSDAY(false),
            FRIDAY(false),
            SATURDAY(true),
            SUNDAY(true);

            private final boolean isWeekend;

            Days(boolean isWeekend) {
                this.isWeekend = isWeekend;
            }

            public boolean isWeekend() {
                return isWeekend;
            }
        }

        Days day = Days.SATURDAY;

        if (day.isWeekend()) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }
    }

    /**
     * 5:
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");

        enum Operator {
            ADD {
                public int performOperation(int num1, int num2) {
                    return num1 + num2;
                }
            },
            SUBTRACT {
                public int performOperation(int num1, int num2) {
                    return num1 - num2;
                }
            },
            MULTIPLY {
                public int performOperation(int num1, int num2) {
                    return num1 * num2;
                }
            },
            DIVIDE {
                public int performOperation(int num1, int num2) {
                    return num1 / num2;
                }
            };

            public abstract int performOperation(int num1, int num2);
        }

        int num1 = 5;
        int num2 = 2;
        Operator operator = Operator.ADD;
        int result = operator.performOperation(num1, num2);
        System.out.println("Result: " + result);
    }
}
