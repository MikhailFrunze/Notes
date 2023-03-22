package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{5, 7, 14, 33, 50, 88, 101, 128, 187, 808, 888, 1881};

        binarySearch(array,888);
        System.out.println("The searched number is on index " +  binarySearch(array,888) + " ");
        binarySearch(array,808);
        System.out.println("The searched number is on index " +  binarySearch(array,808) + " ");

    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    static int binarySearch(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;
            if (number < array[middle]) {
right = middle - 1;
            } else if (number > array[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }
}
