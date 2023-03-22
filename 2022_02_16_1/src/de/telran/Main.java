package de.telran;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        /*//System.out.println(System.currentTimeMillis());
        Random random = new Random(System.currentTimeMillis());
        random.nextInt();
        double rnd = Math.random();
        //System.out.println(rnd);
        System.out.println(getRandomInt(-100, 100));
        //System.out.println(random.nextDouble());
        System.out.println(getRandomInt2(random, -100, 100));*/
        int [] array = getRandomIntArray(20, -50, 50);
        printArray(array);
    }

    public static int getRandomInt(int min, int max) {
        //Math.random()*(max-min+1);
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public static int getRandomInt2(Random random, int min, int max) {
        return random.nextInt(max - min + 1) + min;
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
    }
}
