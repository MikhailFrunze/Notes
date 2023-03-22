package de.telran;
import java.util.Random;
public class RandomArray implements CreateArrayService {


    @Override
    public int[] createArray(int size) {
        Random rd = new Random();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt();
            System.out.println(array[i]);

        }

        return null;
    }
}
