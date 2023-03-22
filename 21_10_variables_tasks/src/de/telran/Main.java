package de.telran;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        double mashaAppleAteNumber = 2.5;
        double petyaAppleAteNumber = 3.5;
        double totalAppleAteNumber = mashaAppleAteNumber + petyaAppleAteNumber;
        System.out.println("They ate " + totalAppleAteNumber + " in total");
        double mashaPieAteAmount = 1d / 2;
        double petyaPieAteAmount = mashaPieAteAmount / 2;
        double vasyaPieAteAmount = (mashaPieAteAmount + petyaPieAteAmount) * 4;

        double pieAteInTotal = mashaPieAteAmount + petyaPieAteAmount + vasyaPieAteAmount;
        System.out.println("They ate " + pieAteInTotal + " pie in total");
    }

    // Masha ate 1/2 of a pie, Petya ate twice less than Masha, Vasya ate 4 times more than Masha and Petya ate together.
    // How much did they eat all together?


}
