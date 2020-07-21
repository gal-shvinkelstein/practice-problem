package dsa.recursion;

import static java.lang.String.format;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(5));
    }

    private static int factorial(int number) {
        if (number < 1) {
            throw new IllegalArgumentException(format("Can not calculate factorial of %s", number));
        }
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
