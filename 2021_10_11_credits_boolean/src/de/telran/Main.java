package de.telran;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPlanCompleted(1150, 482));
    }

    static boolean isPlanCompleted(int totalInPlan, int mashaMade){
        final double mashaV = 1;
        final double petyaV = mashaV * 0.8;
        final double nonMotivatedVasyaV = mashaV * 0.5;
        final double motivatedVasyaV = mashaV;

        final double totalFirstPackV = mashaV + petyaV + nonMotivatedVasyaV;
        final double totalSecondPackV = mashaV + petyaV + motivatedVasyaV;

        final int firstCreditsPack = totalInPlan * 8 / 10;
        final int secondCreditsPack = totalInPlan - firstCreditsPack;




        final int firstPackMashaMade = (int) (firstCreditsPack / totalFirstPackV);
        final int secondPackMashaMade = (int) (secondCreditsPack / totalSecondPackV);

        return mashaMade >= firstPackMashaMade + secondPackMashaMade;
    }
}
