package de.telran;

public class Main {

    public static void main(String[] args) {
        Human vasya = new Human("Vasya", "Vasin", 20);

        vasya.introduce();


         Human petya = new Human("Petya", "Petin", 22);

         petya.introduce();
         Human mariIvanna = new Human("Maria", "Ivanovna", 60);

        System.out.println(Human.getHumanNumber());
        System.out.println(Human.getAverageAge());

        petya.die();
        System.out.println(Human.getHumanNumber());
        System.out.println(Human.getAverageAge());


    }
}
