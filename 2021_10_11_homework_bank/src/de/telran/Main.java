package de.telran;

public class Main {

    public static void main(String[] args) {
        double mashaLoan = 490;
        double petyaLoan = mashaLoan * 0.8;
        System.out.println(" Petya issued " + petyaLoan + " loans today");
        double vasyaLoan = mashaLoan / 2;
        System.out.println(" Vasya issued " + vasyaLoan + " loans today");
        double target = 1150;
        double todayTarget = mashaLoan + petyaLoan + vasyaLoan;
        System.out.println(todayTarget);
        boolean targetSum = vasyaMotivation(1127);
        System.out.println(vasyaMotivation(1127));
        boolean targetSum2 = vasyaLoanEqualsMashaLoan(1127);
        System.out.println(vasyaLoanEqualsMashaLoan(1127));
        boolean targetSum3 = targetAchieved(1127);
        System.out.println(targetAchieved(1127));

    }
    static boolean vasyaMotivation(double todayTarget) {
        return todayTarget >= (1150 * 0.8);
    }
    static boolean vasyaLoanEqualsMashaLoan(double todayTarget) {
        return todayTarget >= (1150 * 0.8);
    }

    static boolean targetAchieved(double todayTarget) {
        return todayTarget >= (1150 * 0.8);
    }


}
