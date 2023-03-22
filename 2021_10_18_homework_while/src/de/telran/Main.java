package de.telran;

public class Main {

    public static void main(String[] args) {
        arithmeticProgression(7, 14, 1);
        for (int d = 7; d <= 14; d++) {
            System.out.println(d);
        }
    }

    static void arithmeticProgression(int a, int b, int c) {
        int currentNumber = a;

        while (currentNumber <= b) {
            System.out.println(currentNumber);
            currentNumber += c;
        }
        System.out.println();
    }

}
