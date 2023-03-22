package de.telran;

import de.telran.censor.Censor;


public class Main {

    public static void main(String[] args) {
        Censor vasya = new Censor("Vasya", new String[]{"bitch", "shit"});
        Censor petya = new Censor("Petya", new String[]{"damn", "fuck"});
        Censor masha = new Censor("Masha", new String[]{"whore", "bitch"});

        String text1 =  "Hello, bitch, how are you?";
        System.out.println(vasya.verify(text1));
        System.out.println(petya.verify(text1));
        System.out.println(masha.verify(text1));
    }


}
