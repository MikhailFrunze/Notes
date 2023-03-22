package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{1,5,7,12,15};
        delete(array, 1);
        printArray(delete(array,1));
        getIndex(array,7);
        System.out.println(getIndex(array,7));
    }

    /**
     * creates a new array in memory, which is a copy of the old array, and then returns a reference to it
     *
     * @param array to copy
     * @return a copy
     */
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int[] copy(int[] array) {
        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }

        return res;
    }

    static int[] append(int[] array, int elt) {
        int[] res = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            res[i] = array[i];
        }

        res[res.length - 1] = elt;
        return res;
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

    static int[] delete(int[] array, int index) {
        int[] res = new int[array.length - 1];
        for (int i = 0; i < index; i++) {
            res[i] = array[i];
        }

        for (int i = index + 1; i < array.length; i++) {
            res[i - 1] = array[i];
        }
        return res;
    }

    static int getIndex(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i])
                return i;

            if (number < array[i])
                return -(i + 1);
        }
        return -(array.length + 1);
    }
}