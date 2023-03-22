package de.telran;

public class Main {

    public static void main(String[] args) {
        double petyaCheesecake = 4 - 1;
        double mashaCheesecake = petyaCheesecake / 2 - 1;
        double vasyaCheesecake = petyaCheesecake + mashaCheesecake + 1;
        double totalCheesecake = petyaCheesecake + mashaCheesecake + vasyaCheesecake;
        System.out.println(totalCheesecake);
        boolean cheesecake = isDividedBy3((int) totalCheesecake);
        System.out.println(isDividedBy3((int) totalCheesecake));
        double mashaEatenCheesecake = mashaCheesecake + totalCheesecake % 3;

        if (mashaCheesecake >= 4) {
            System.out.println("Masha is happy");
        } else {
            System.out.println("Masha is not happy");

        }
    }

    static boolean isDividedBy3(int totalCheesecake) {
        return totalCheesecake % 3 == 0;
    }
}
