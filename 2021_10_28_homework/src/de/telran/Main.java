package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[5];
        multiplyPositiveElements(array);
        replaceOddsWith0(array);
        int[][] array1 = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array1[i][j] = i * 10 + j;
                System.out.print(array1[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(countStringsWithOdds(array1));


    }


    static void multiplyPositiveElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                arr[i] = 3 * i;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    static void replaceOddsWith0(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i] = 0;
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }

    static int countStringsWithOdds(int[][] arr) {
        int res = 0;
        outerFor:
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 !=0){
                    res ++;
                    continue outerFor;
                }
                System.out.println();
            }

        }
        return res;
    }



}

