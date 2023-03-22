package de.telran;

public class Main {

    public static void main(String[] args) {
        printNumbersTillDividedBy5Or7Or13(10);
        printNumbersTillDividedBy5Or7Or13(100);
        printNumbersTillDividedBy5Or7Or13(1000);

        for (int a = 5; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println();

        for (int a1 = 7; a1 >= 5; a1--) {
            System.out.println(a1);
        }

        System.out.println();
    }


    static void printNumbersTillDividedBy5Or7Or13(int max) {
        for (int currentNumber = 1; currentNumber <= max; currentNumber++) {
            if (currentNumber % 5 == 0 || currentNumber % 7 == 0 || currentNumber % 13 == 0) {
                System.out.print(currentNumber + " ");
            }

        }
    }
}
