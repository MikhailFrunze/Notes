package de.telran;

public class Main {

    public static void main(String[] args) {
        printDecreasingArithmeticalProgression(10, 1, 3);
        printNumbersTillDividedBy5Or7Or13(10);
        printNumbersTillDividedBy5Or7Or13(100);
        printNumbersTillDividedBy5Or7Or13(1000);

    }

    /**
     * Print all numbers between a and b with the step d, where a must be greater than b
     *
     * @param a
     * @param b
     * @param d
     */
    static void printDecreasingArithmeticalProgression(int a, int b, int d) {
        int currentNumber = b;

        while (currentNumber >= b) {
            System.out.println(currentNumber);
            currentNumber -= d;
        }
        System.out.println();
    }

    static void printNumbersTillDividedBy5Or7Or13(int max) {
        int currentNumber = 1;

        while (currentNumber <= max) {
            if (currentNumber % 5 == 0 || currentNumber % 7 == 0 || currentNumber % 13 == 0) {
                System.out.print(currentNumber + " ");
            }
            currentNumber++;
        }
        System.out.println();
    }
}
