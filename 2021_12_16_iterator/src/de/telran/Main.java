package de.telran;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        int[] array = {10, 7, 17, 25}; // to iterate



        // any iterator must not change the collection it iterates
	CustomIterator<Integer> iterator = new IntArrayStraightIterator(array);
	CustomIterator<Integer> iterator1 = new ArrayIterator(array);

    // how to use iterators

        while (iterator.hasNext()){
            int currentElement = iterator.next();
          System.out.println(currentElement);
        }


        while (iterator.hasNext()) {
            int currentElement = iterator.next1();
            System.out.println(currentElement);
        }


                 iterator1.reverseIterate();



    }
}
