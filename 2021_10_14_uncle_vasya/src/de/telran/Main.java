package de.telran;

public class Main {

    public static void main(String[] args) {
        printVasyaAction(1,20);
        printVasyaAction(3,18);
        printVasyaAction(6,18);
        printVasyaAction(7,0);
        printVasyaAction(7,-7);
    }

     /**
     * The method prints out the actions of uncle Vasya
     * @param dayOfWeek must be from 1 to 7 otherwise the behaviour unpredictable
     * @param temperature
     */
    static void printVasyaAction(int dayOfWeek, int temperature) {
        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Uncle Vasya goes working");
        }else if(dayOfWeek == 6 && temperature >= 23 && temperature <= 29) {
            System.out.println("Uncle Vasya goes fishing");
        }else if (dayOfWeek == 7 && temperature<=-5) {
            System.out.println("Uncle Vasya goes to the neighbour's sauna");
        }else {
            System.out.println("Vasya has a rest");
        }

    }
}
