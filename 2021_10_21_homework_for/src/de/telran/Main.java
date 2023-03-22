package de.telran;

public class Main {

    public static void main(String[] args) {
        for (int mashaCredit = 0; mashaCredit <= 18; mashaCredit++) {
            System.out.println("Masha issued " + (50 * mashaCredit) * 1.170 + " credits");


        }

        int n = 50*18;

        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }

}
