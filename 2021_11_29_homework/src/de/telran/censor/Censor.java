package de.telran.censor;

import java.util.Arrays;

public class Censor {
    public String name;
    public String[] badWordsVocabulary;

    public Censor(String name, String[] badWordsVocabulary) {
        this.name = name;
        this.badWordsVocabulary = Arrays.copyOf(badWordsVocabulary, badWordsVocabulary.length);

    }

    public String getName() {
        return name;
    }

    public String[] getBadWordsVocabulary() {
        return badWordsVocabulary;
    }

    public boolean verify(String str){
        for (int i = 0; i < badWordsVocabulary.length; i++) {
            if (str.contains(badWordsVocabulary[i]))
                return false;
        }
        return true;
    }
}
