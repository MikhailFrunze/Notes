package de.telran;

public class Main {

    public static void main(String[] args) {
        int squareSum = square(3);
        System.out.println(squareSum);
        int cubeSum = cube(3);
        System.out.println(cubeSum);
        boolean someResult = isDividedBy3(15);
        System.out.println(isDividedBy3(15));
        boolean someResult2 = isDividedBy5Or7(35);
        System.out.println(isDividedBy5Or7(35));
        boolean someResult3 = isANumberBetween100And200(5);
        System.out.println(isANumberBetween100And200(5));
    }

    static int square(int x) {
        int result = x * x;
        return result;
    }

    static int cube(int y) {
        int result = y * y * y;
        return result;
    }

    static boolean isDividedBy3(int a) {
        // boolean isDividedBy3 = a % 3 >= 0;
        // boolean res = isDividedBy3;
        return a % 3 >= 0;
    }

    static boolean isDividedBy5Or7(int b) {
        return (b % 5 >= 0) | (b % 7 >= 0);
    }
    static boolean isANumberBetween100And200 (int c) {
        return (c >= 100) & (c <= 200);
    }
}
