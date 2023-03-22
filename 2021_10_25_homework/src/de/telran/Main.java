package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4, 5};
        printArrayReversed(array);
        int[] array1 = new int[]{5, 10, 7, 15};
        array1[0] = 15;
        array1[1] = 7;
        array1[2] = 10;
        array1[3] = 5;
        printArray1(array1);
        int[] array2 = new int[]{5, 7, 14, 33, 50};
        array2[0] = array2[0] * 3;
        array2[1] = array2[1] * 3;
        array2[2] = array2[2] * 3;
        array2[3] = array2[3] * 3;
        array2[4] = array2[4] * 3;
        printArray2(array2);
        int[] array3 = new int[]{-5, -7, -14, -33, -50};
        printArray3(array3);
        int[] whoIssuedLoan = new int[]{26, 5, 7, 14, 15};
        printWhoIssuedLoan(whoIssuedLoan);
        int arrayLength = whoIssuedLoan.length;
        System.out.println("The number of issued loans = " + arrayLength + " ");
        int[][] array4 = {{-5, -7, -14, -33, -50}, {55, 77, 14, 33, 50}};
        howManyNegatives(array4);
        System.out.println("There is (are) " + howManyNegatives(array4) + " string(s) with negative elements");
    }

    static void printArrayReversed(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    static void printArray1(int[] array1) {
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");

        }
        System.out.println();
    }

    static void printArray2(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");

        }
        System.out.println();
    }

    static void printArray3(int[] array3) {
        for (int i = 0; i < array3.length; i++) {
            array3[i] *= -1;
            System.out.print(array3[i] + " ");

        }
        System.out.println();
    }

    static void printWhoIssuedLoan(int[] whoIssuedLoan) {
        for (int i = 0; i < whoIssuedLoan.length; i++) {
            System.out.print(whoIssuedLoan[i] + " ");
            if (whoIssuedLoan[i] % 13 == 0) {
                System.out.println("Nobody issues current loan");
            } else if (whoIssuedLoan[i] % 3 == 0) {
                System.out.println("Masha issues current loan");
            } else if (whoIssuedLoan[i] % 3 == 1) {
                System.out.println("Petya issues current loan");
            } else if (whoIssuedLoan[i] % 3 == 2) {
                System.out.println("Vasya issues current loan");
            }

        }
    }

    static int howManyNegatives(int[][] array4) {
        int negativesRes = 0;
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4.length; j++) {
                if (array4[i][j] < 0)
                    negativesRes++;
                break;

            }

        }
        return negativesRes;
    }
}
