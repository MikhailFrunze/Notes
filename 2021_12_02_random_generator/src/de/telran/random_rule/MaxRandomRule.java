package de.telran.random_rule;

import de.telran.random_rule.IRandomRule;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TODO the class should have a constructor, which receives a positive number and the method nextInt must return
// only random numbers between 0 inclusive and max exclusive
public class MaxRandomRule implements IRandomRule {

    private final int max;

    public MaxRandomRule(int max) {
        this.max = max;
    }

    @Override
    public int nextInt() {
        int randomizer = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < max-1; i++) {
            randomizer=+i;
            integerList.add(randomizer);

        }
        Collections.shuffle(integerList);
        return randomizer;
    }
}
