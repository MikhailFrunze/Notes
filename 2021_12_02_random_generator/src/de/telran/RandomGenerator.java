package de.telran;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import de.telran.random_rule.IRandomRule;
import de.telran.random_rule.ListRandomRule;
import de.telran.random_rule.MaxRandomRule;
import de.telran.random_rule.RangeRandomRule;

public class RandomGenerator {

    private final IRandomRule randomRule;

    public RandomGenerator(IRandomRule randomRule) {
        this.randomRule = randomRule;
    }

    public List<Integer> generateNumbers(int number) {
        //TODO compose a list of "number" random numbers using "randomRule" and return
        int res = number / 1;
        int randomizer = 0;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < res; i++) {
           randomizer++;
            integerList.add(randomizer);
        }

        Collections.shuffle(integerList);
        return integerList;

       }



    }

