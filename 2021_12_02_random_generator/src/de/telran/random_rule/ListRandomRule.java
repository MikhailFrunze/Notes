package de.telran.random_rule;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//TODO the class should have a constructor, which receives a list of numbers and the method nextInt must return
// only the numbers from this list
public class ListRandomRule implements IRandomRule {

    public ListRandomRule(List<Integer> numbers) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(5);
        integerList.add(7);
        integerList.add(14);
    }

    public int getRandomElement(List<Integer> list) {
        Random rand = new Random();
        return list.get(rand.nextInt(list.size()));
    }


    @Override
    public int nextInt() {
        return 0;
    }
}
