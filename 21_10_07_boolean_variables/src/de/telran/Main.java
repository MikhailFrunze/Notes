package de.telran;

public class Main {

    public static void main(String[] args) {
        boolean a = true;
        System.out.println(a);

        System.out.println(!a);
        boolean b = true;
        boolean orResult = a | b;//true

        b = false;
        orResult = a | b;//true

        a = false;
        orResult = a | b;//false

        b = true;
        orResult = a | b;//true

        // and (&) operation
        System.out.println(true & true);// true
        System.out.println(true & false);// false
        System.out.println(false & true);// false
        System.out.println(false & false);// false

        // xor (^) operation
        System.out.println(true ^ true);// true
        System.out.println(true ^ false);// false
        System.out.println(false ^ true);// false
        System.out.println(false ^ false);// false


        //comparison operators: >, >=, <, <=, ==, !=

        int someInt = 15;
        double someDouble = -23.7;
        boolean isSomeIntGreaterThanSomeDouble = someInt > someDouble;


        // exercises
        boolean someRes = isDividedBy15(25);
        boolean number = isDividedBy3(6);
        System.out.println(isDividedBy15(15));

    }

    //write a function which determines whether a number is divided by 15
    static boolean isDividedBy15(int number) {
        //      boolean isDividedBy3 = number % 3 == 0;
        //      boolean isDividedBy5 = number % 5 == 0;
        //     boolean res = isDividedBy3 & isDividedBy5;
        //     return res;
        return (number % 3 == 0) & (number % 5 == 0);


    }

    static boolean isDividedBy3(int number) {
        return number % 3 == 0;
    }

}
