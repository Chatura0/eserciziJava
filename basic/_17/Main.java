package javabasics._17;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");
        int myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                            Hello Sir/Madam,
                            
                            I'm a prince here in [redacted] and I need help transferring my billions into 
                            Italy, please provide your bank account details and I will pay you generously.
                            
                            Thanks
                """;

        long questionableFundsEuro = 5_000_000_000l;

        //Add the questionable funds to your bank balance and print it out!
        myBankBalanceEuro += questionableFundsEuro;
        System.out.println("My bank balance is now: " + myBankBalanceEuro + " €");
    }

    /**
     * 2: Given the following information, think about the MOST EFFICIENT (which uses least space)
     *    type to use to store such data. Why is this the most efficient?
     *
     *    long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
     *    double = 16 decimal places
     *    float = 7 decimal places
     *    int = -2,147,483,648 to 2,147,483,647
     *    short = -32,768 to 32,768
     *    byte = -127 to 127
     *
     *    2a: Someone's age =
     *    (byte) sarebbe il tipo più efficiente da usare perché l'età è in genere un piccolo valore intero.
     *    2b: The age of a baby in months =
     *    (byte) sarebbe anche il tipo più efficiente da usare perché l'età massima di un bambino in mesi è di 24 mesi.
     *    2c: Money in a hedgefund in euros =
     *    (double) sarebbe il tipo più efficiente da usare perché consente valori decimali grandi e precisi.
     *    2d: Price of a good in euros on amazon.com =
     *    (double) per lo stesso motivo di 2c.
     *    2e: The exact weight of an apple measured by scientific equipment =
     *    (float) sarebbe il tipo più efficiente da usare perché l'attrezzatura scientifica di solito fornisce misurazioni con alta precisione.
     *    2f: The number of kilometers from any 2 places in the world =
     *    (int) sarebbe il tipo più efficiente da usare
     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */

    public static void exercise3() {
        System.out.println("Exercise 3:");

        LocalDate myDate = LocalDate.now();
        System.out.println("Current date: " + myDate);

        int dayOfMonth = myDate.getDayOfMonth();
        System.out.println("Day of the month: " + dayOfMonth);

        String dayOfWeek = myDate.getDayOfWeek().toString();
        System.out.println("Day of the week: " + dayOfWeek);

        int dayOfYear = myDate.getDayOfYear();
        System.out.println("Day of the year: " + dayOfYear);

        String month = myDate.getMonth().toString();
        System.out.println("Month: " + month);

        int monthValue = myDate.getMonthValue();
        System.out.println("Month value: " + monthValue);

        LocalDate otherDate = LocalDate.of(2022, 5, 1);
        boolean isBefore = myDate.isBefore(otherDate);
        boolean isAfter = myDate.isAfter(otherDate);
        System.out.println(myDate + " is before " + otherDate + ": " + isBefore);
        System.out.println(myDate + " is after " + otherDate + ": " + isAfter);
    }
}

