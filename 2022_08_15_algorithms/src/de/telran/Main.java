package de.telran;

public class Main {

    public static void main(String[] args) {
        // write your code here
    }

    public static void swap(int[] arr, int i1, int i2) {
        int temp = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = temp;
    }

    public static void m(int[] arr, int i1, int i2) {
        arr[i1] = i2;
    }

    public static int find(int[] arr, int i1) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                for (int k = 0; k < arr.length; k++) {
                    if (arr[k] == i1) return i;
                }
            }
        }
        return -1;
    }
}
