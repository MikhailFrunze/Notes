package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] intArray = new int[]{10, -15, 8};
        intArray = new int[5];//{0,0,0,0,0}

        // 1. операция над масивом - узнать размер массива

        int arrayLength = intArray.length;//5

        //2. операция над массивом - узнать элемент по индексу

        int firstElt = intArray[0];//0

        //3. операция над массивом - присвоить элемент по индексу

        intArray[2] = 10;// {0, 0, 10, 0, 0}

        printArray(intArray);



        int[] anotherArray = new int[]{15, 10, -6, 0, 17, 35};
        fillArray(anotherArray);
        printArray(anotherArray);



    }

    static void fillArray(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
            array[i] = i;

        }
    }

    //determine whether the array contains odd numbers
    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }
        return sum;
    }

    //determine whether the array contains odd numbers
    static boolean hasOdds(int[] array){
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2 !=0 ){
                return true;
            }
            
        }
        return false;
    }

    static int sumOddsLowerThan(int[] array, int max) {
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0 || array[i] <= max)
                continue;// move to the next iteration
                res+= array[i];

        }
        return res;
    }
}
