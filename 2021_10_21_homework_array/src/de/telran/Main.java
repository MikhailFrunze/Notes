package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{5, -7, 14, 33, 50};
        printArray(intArray);
        System.out.println(hasNumber((intArray), 5));



    }

    static void printArray(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    static boolean hasNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return true;
            }

        }
        return false;
    }

}
