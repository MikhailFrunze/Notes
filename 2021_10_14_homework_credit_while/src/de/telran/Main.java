package de.telran;

public class Main {

    public static void main(String[] args) {

        double mashaLoanPerMonth = 50;
        double petyaLoanPerMonth = mashaLoanPerMonth * 0.8;
        double nonmotivatedVasyaLoanPerMonth = mashaLoanPerMonth * 0.5;
        double motivatedVasyaLoanPerMonth = mashaLoanPerMonth;
        double nonMotivatedTeamPerMonth = mashaLoanPerMonth + petyaLoanPerMonth + nonmotivatedVasyaLoanPerMonth;
        double issuedLoansFirstPack = 1370;
        double monthsNeededFirstPack = issuedLoansFirstPack / nonMotivatedTeamPerMonth;
        System.out.println(monthsNeededFirstPack);
        double target = 2100;
        double motivatedTeamPerMonth = mashaLoanPerMonth + petyaLoanPerMonth + motivatedVasyaLoanPerMonth;
        double remainingTarget = target - issuedLoansFirstPack;
        System.out.println(remainingTarget);
        double monthsNeededSecondPack = remainingTarget / motivatedTeamPerMonth;
        double monthsNeededTotal = monthsNeededFirstPack + monthsNeededSecondPack;
        System.out.println(monthsNeededTotal);
    }
}
