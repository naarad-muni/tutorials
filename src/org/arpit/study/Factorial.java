package org.arpit.study;

import java.util.Random;

public class Factorial {

    // This is stateless because output is solely dependent on input
    public static int getFactorial(final int number) {
        if (number <= 1) { // base case
            return 1;
        }
        else {
            return number * getFactorial(number - 1);
        }
    }

    // Stateless because no member variable of class is getting used
    // and the output is predictable
    public static String getMotivationalMessage() {
        return "Do or do not, there is no try";
    }

    // Stateless because this is using another Stateless method
    public static int luckyNumber() {
        int randomNumber = (int) (Math.random() * 100);

        return randomNumber;
    }

    // We are not sure, whether this will be stateless or not
    public int modifiedLuckyNumber() { // Ambiguous case
        Random random = new Random();

        return random.nextInt(100);
    }
}
