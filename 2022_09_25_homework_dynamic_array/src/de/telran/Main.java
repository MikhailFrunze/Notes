package de.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 2, -10, 15, 7};
        printArray(array);
        int[] array2 = insert(array, 0, 5);
        System.out.println(Arrays.toString(array2));
        array2 = add(array2, 5);
        System.out.println(Arrays.toString(array2));
        array2 = remove(array2, 1);
        System.out.println(Arrays.toString(array2));
        System.out.println(size(array2));
    }


    static int[] add(int[] array, int elt) {
        int[] res = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }

        res[res.length - 1] = elt;
        return res;
    }

    static int[] remove(int[] array, int index) {
        int[] res = new int[array.length - 1];

        for (int i = 0; i < index; i++) {
            res[i] = array[i];
        }

        for (int i = index; i < res.length; i++) {
            res[i] = array[i + 1];
        }

        return res;
    }

    public static int size(int[] array) {
        return array.length;
    }

    static int[] insert(int[] array, int index, int elt) {
        int[] res = new int[array.length + 1];

        for (int i = 0; i < index; i++) {
            res[i] = array[i];
        }

        res[index] = elt;

        for (int i = index; i < array.length; i++) {
            res[i + 1] = array[i];
        }

        return res;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    

}
