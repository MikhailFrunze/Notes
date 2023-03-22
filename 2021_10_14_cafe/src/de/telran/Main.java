package de.telran;

public class Main {

    public static void main(String[] args) {
        int petyaOrdered = 4;
        int mashaOrdered = petyaOrdered / 2;
        int mashaAteBeforeVasyaCame = 1;
        int petyaAteBeforeVasyaCame = 1;

        int piesOnTableBeforeVasyaCame = petyaOrdered + mashaOrdered - mashaAteBeforeVasyaCame - petyaAteBeforeVasyaCame;

        int vasyaOrdered = piesOnTableBeforeVasyaCame + 1;


        int totalOnTable = piesOnTableBeforeVasyaCame + vasyaOrdered;

        if (totalOnTable % 3 == 0) {
            System.out.println("The pies can be shared by guys");

            int mashaAteInTotal = mashaAteBeforeVasyaCame + totalOnTable / 3;
            if (mashaAteInTotal >= 4) {
                System.out.println("Masha is happy");
            }
        }
    }
}
