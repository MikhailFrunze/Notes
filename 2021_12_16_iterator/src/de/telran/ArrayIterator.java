package de.telran;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;

public class ArrayIterator implements CustomIterator<Integer> {

    private final int[] array;
    int currentId = 0;

    public ArrayIterator(int[] array) {
        this.array = array;
    }

    @Override
    public boolean hasNext() {
        return currentId < array.length;
    }

    @Override
    public Integer next() {
        int res = array[currentId];
        currentId++;
        return res;
    }

    @Override
    public Integer next1() {
        return null;
    }


    public void reverseIterate() {
       Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));
    }
}