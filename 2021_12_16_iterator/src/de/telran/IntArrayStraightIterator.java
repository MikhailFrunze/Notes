package de.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IntArrayStraightIterator implements CustomIterator<Integer>{

    private final int[] array;
    int currentId = 0;

    public IntArrayStraightIterator(int[] array) {
        this.array = array;
    }


    @Override
    public boolean hasNext() {
        return currentId<array.length;
    }

    @Override
    public Integer next() {
      int res = array[currentId];
      currentId++;
        return res;
    }

    public Integer next1() {
        Arrays.sort(array);
        int res = array[currentId];
        currentId++;
        return res;
    }

    @Override
    public void reverseIterate() {

    }

}
