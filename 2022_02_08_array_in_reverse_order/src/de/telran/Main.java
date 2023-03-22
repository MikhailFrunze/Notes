package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 14, 33};
        printArray(array);
        arrayInReverseOrder(array);
        arrayInReverseOrderWithoutNew(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    /*Implement a method that returns the new array that is the given array in reverse order
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}*/

    public static void arrayInReverseOrder(int[] array) {
        int[] arr = array;
        for (int i = array.length - 1; i >= 0; i--) {
            arr[i] = array[i];
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    /*Implement a method that returns a given array in reverse order. It’s look like previous
but you should solve it without new array
{10, 3, 3, 5, -9} -> {-9, 5, 3, 3, 10}*/

    public static void arrayInReverseOrderWithoutNew(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
