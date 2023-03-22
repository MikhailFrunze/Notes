package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println(square(1));
        System.out.println(square(2));
        System.out.println(square(3));
        System.out.println(square(13));
        System.out.println(square(12));

        System.out.println(cube(1));
        System.out.println(cube(2));
        System.out.println(cube(3));
        System.out.println(cube(13));
        System.out.println(cube(12));

    }


    static int square(int number) {

        return number * number;
    }

    static int cube(int number) {

        return number * number * number;
    }
}
