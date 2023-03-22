package de.telran;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[][] array = fillArray(5, 3);
        printArray(array);
        System.out.println("--------------");
        System.out.println(getRowIndexWithMinimumSum(array));


    }


    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" (" + sumElements(array[i]) + ")");
        }
    }

    /*public static void fillEvenNumbers(int row, int line) {
        Random r = new Random();
        int[][] array = new int[row][line];
        for (row = 0; row < array.length; row++) {
            for (line = 0; line < array[row].length; line++) {
                array[row][line] = r.nextInt(10);
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 == 0) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();
    }*/

    static int sum(int[] array) {
        int res = 0;

        for (int i = 0; i < array.length; i++) {
            res += array[i];
        }

        return res;
    }


    public static void countArrayStringSum(int[][] array) {
        int res = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                for (int k = 0; k < array[i].length; k++) {
                    for (int l = 0; l < array[i].length; l++) {
                        if (sum(array[j]) < sum(array[k]) && sum(array[j]) < sum(array[l])) {
                            System.out.print("The sum of first string is smaller than else");

                        } else if (sum(array[k]) < sum(array[j]) && sum(array[k]) < sum(array[l])) {
                            System.out.print("The sum of second string is smaller than else");

                        } else if (sum(array[l]) < sum(array[j]) && sum(array[l]) < sum(array[k])) {
                            System.out.print("The sum of third string is smaller than else");

                        }


                    }

                }

            }

        }

    }

    public static double sumColumn(int[][] m, int columnIndex) {
        double sum = 0;
        for (int i = 0; i < m.length; i++) {
            sum += m[i][columnIndex];

        }
        return sum;
    }

    public static int[][] fillEvenNumbers1(int n, int m) {
        int[][] result = new int[n][m];
        int evenNum = 2;
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = evenNum;
                evenNum += 2;
            }
        }
        return result;
    }

    public static int[][] fillArray(int n, int m) {
        int min = -50;
        int max = 50;
        int[][] result = new int[n][m];
        Random random = new Random(System.currentTimeMillis());
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = random.nextInt(max - min + 1) + min;
            }

        }
        return result;
    }

    public static int sumElements(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        return result;
    }

    public static int getRowIndexWithMinimumSum(int[][] array) {
        int min = sumElements(array[0]);
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = sumElements(array[i]);
            if (sum < min) {
                min = sum;
                index = i;
            }
        }

        return index;
    }
}


