package de.telran;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {-1, 2, -3, 4, -5, 6, -7},
                {8, -9, 10, -11, 12, -13, 14},
                {15, 16, 17, 18, 19, 20, 21, 22},
                {-23, 24, -25, 26, -27, 28, -29, 30}
        };
        System.out.println(countStringsWithPositives(array));
        getSubarraySums(array);
        System.out.println(getSubarraySums(array));
        int[] array1 = new int[]{7, 5, 14, 33, 50, 88, 101, 128, 187, 808, 888, 1881};
        functionMin(array1);
        sort(array1);


    }

    static int countStringsWithPositives(int[][] arr) {
        int res = 0;
        outerFor:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j >= 0) {
                    res++;
                    continue outerFor;
                }
                System.out.println();
            }

        }
        return res;
    }

    static int[] getSubarraySums(int[][] array) {
        int[] res = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            if (i >= 0) {
                res[i] += i;
                System.out.print(res[i] + "\t");
            }
            System.out.println();
        }
        return res;
    }

    static void functionMin(int[] array) {

        int min = array[0];
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }

        }
        System.out.println("min value: " + min);
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {    // i - номер текущего шага
            int pos = i;
            int min = array[i];
            // цикл выбора наименьшего элемента
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j;    // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min;    // меняем местами наименьший с array[i]
        }
        System.out.println(array + "\t");
    }
}
