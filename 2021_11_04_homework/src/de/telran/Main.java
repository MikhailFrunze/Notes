package de.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 33, 50, 88};
        System.out.println("Original array" + Arrays.toString(array));
        int index = 2;
        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }
        System.out.println("New array" + Arrays.toString(newArray));


        printArray(delete(array,1));

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static int[] delete(int[] array, int index) {
        int[] newArray = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {

            if (i == index) {
                continue;
            }
            newArray[j++] = array[i];
        }

return newArray;
    }

    static int[] returnIndexOrNumber(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            int num = - (0 + 1);
        }

    }

}




