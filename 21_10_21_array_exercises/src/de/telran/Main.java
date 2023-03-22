package de.telran;

public class Main {

    public static void main(String[] args) {
       int[] array = {5,2,-10,15,7};
       printArrayReversed(array);
        System.out.println(sumOdds(array));
        System.out.println(sumPositives(array));
        System.out.println(containsNumber(array, 15));
        System.out.println(sumEvensLowerThan(array,0));
       array = new int[]{15, 8, 4, -6};
       printArrayReversed(array);
        System.out.println(sumOdds(array));
        System.out.println(sumPositives(array));
        System.out.println(containsNumber(array, 14));
        System.out.println(sumEvensLowerThan(array,6));
    }

    static void printArrayReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int sumOdds(int[] array) {
        int res = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 1)
                res+=array[i];

        }
        return res;
    }

    static int sumPositives(int[] array) {
        int res = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0)
                res+=array[i];

        }
        return res;
    }

    static boolean containsNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number)
                return true;
        }
        return false;
    }

    static int sumEvensLowerThan(int[] array, int number) {
        int res = 0;


        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 == 0 && array[i] <= number)
                res+=array[i];

        }
        return res;
    }

}
