package org.arpit.study;

public class FibonacciCalculator {

    public static long fibonacci(long n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
}
