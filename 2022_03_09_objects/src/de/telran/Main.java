package de.telran;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	int[][]array=fillArray(5,7);
    printArray(array);
        System.out.println("----------------------------------");
        System.out.println(getColumnSum(array, 6));
        String str="£!%^&*(())";
        String str1 = str.substring(3);

    }
    
    public static int getColumnSum(int[][]arr, int columnIndex){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i][columnIndex];
            
        }
        return sum;
    }

    public static int[][] fillArray(int n, int m) {
        int min = 0;
        int max = 10;
        int[][] result = new int[n][m];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = random.nextInt(max - min + 1) + min;
            }

        }
        return result;
    }

    public static void printArray(int[][] array) {
      /*  System.out.println(Arrays.deepToString(array));*/

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));

        }
    }
}
