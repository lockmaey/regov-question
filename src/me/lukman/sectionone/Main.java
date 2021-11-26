package me.lukman.sectionone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter a positive integer: ");
        int n = myObj.nextInt();
        int factorial = multiplyNumbers(n);
        System.out.println("Factorial of " + n + "! = " + factorial);
        System.out.println("Sum of " + factorial + " digit = " + sumOfDigit(factorial));

    }

    private static int multiplyNumbers(int n) {
        if (n >= 1)
            return n * multiplyNumbers(n - 1);
        else
            return 1;
    }

    private static int sumOfDigit(int n) {
        return n == 0 ? 0 : n % 10 + sumOfDigit(n / 10);
    }
}
