package de.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {8,0,4,7,3,7,10,12,-3};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left, int right) {
        if (arr.length <= 0 || left >= right) return;

        int pivotIndex = partition(arr, left, right);

        quickSort(arr, left, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int index = left;

        for (int i = left; i < right; i++) {
            if (arr[i] <= pivot){
                swap(arr, i, index);
                index++;
            }
        }

        swap(arr, right, index);
        return index;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
