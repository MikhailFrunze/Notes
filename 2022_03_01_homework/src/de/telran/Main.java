package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] arr1 = new int[]{14, 7, 5};
        int[] arr2 = new int[]{88, 50, 33};
        System.out.println(sumArray(arr1, 0));

    }

    /*public static int merge(int[] arr1, int[] arr2) {
       int[] arr = new int[]{};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] > arr2[j])
                    arr2[j] = arr[i];
                if (arr1[i] < arr2[j]) arr1[i] = arr[i];

            }


        }
        return arr;
    }*/

    public static int sumArray(int arr[], int index) {
        if (index == arr.length) {
            return 0;
        } else {
            return arr[index] + sumArray(arr, index + 1);
        }
    }

    public static int sumArr (int arr[]){
        return sumArray(arr, 0);
    }
}


