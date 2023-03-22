package de.telran;

import java.util.Random;

public class GrowingOrderArrray implements CreateArrayService {
    public int[] createArray(int size) {
        int[]  array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]+i);
        }
        return null;
    }
}
