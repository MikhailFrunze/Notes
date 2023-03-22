package de.telran;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = getRandomIntArray(20, -50, 50);
        printArray(array);
        System.out.println("--------------------------------------------------------------");
        sort(array);
        printArray(array);
    }

    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static int[] getRandomIntArray(int size, int min, int max) {
        int[] resArray = new int[size];
        Random rnd = new Random(System.currentTimeMillis());
        for (int i = 0; i < resArray.length; i++) {
            resArray[i] = rnd.nextInt(max - min + 1) + min;

        }
        return resArray;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void sort(int[] arr) {
        boolean flag = true;
        int counter = 0;
        while (flag) {
            flag = false;
            for (int i = 0; i < arr.length; i++) {
                counter++;
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i - 1, i);
                    flag = true;
                }
            }
        }
        System.out.println(counter);
    }

}

