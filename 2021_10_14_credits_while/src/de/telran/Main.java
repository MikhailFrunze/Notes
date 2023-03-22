package de.telran;

public class Main {

    public static void main(String[] args) {
        int mashaVelocity = 50;
        int petyaVelocity = mashaVelocity * 8 / 10;
        int lazyVasyaVelocity = mashaVelocity / 2;
        int motivatedVasyaVelocity = mashaVelocity;


        int totalGivenCredits = 0;
        int monthNumber = 0;
        while (totalGivenCredits < 2100) {
            if (totalGivenCredits < 1370) {
                totalGivenCredits += mashaVelocity + petyaVelocity + lazyVasyaVelocity;
            } else {
                totalGivenCredits += mashaVelocity + petyaVelocity + motivatedVasyaVelocity;
            }
            monthNumber++;
        }
        System.out.println(monthNumber);
        System.out.println(totalGivenCredits);
    }
}
