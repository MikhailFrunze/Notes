package de.telran;

public class Main {

    public static void main(String[] args) {
        printDayOfWeek(6);
        printVasyaAction(23,6);
    }

    static void printDayOfWeek(int dayOfWeek) {
        switch (dayOfWeek) {
            case 1:
                System.out.println("The day of week is Monday");
                break;
            case 2:
                System.out.println("The day of week is Tuesday");
                break;
            case 3:
                System.out.println("The day of week is Wednesday");
                break;
            case 4:
                System.out.println("The day of week is Thursday");
                break;
            case 5:
                System.out.println("The day of week is Friday");
                break;
            case 6:
                System.out.println("The day of week is Saturday");
                break;
            case 7:
                System.out.println("The day of week is Sunday");
                break;
            default:
                System.out.println("No such day of week");
        }
    }

    static void printVasyaAction(int temperature, int dayOfWeek) {
        if (dayOfWeek >= 1 && dayOfWeek <= 5) {
            System.out.println("Uncle Vasya goes working");
        } else if (dayOfWeek == 6 && temperature >= 23 && temperature <= 29) {
            System.out.println("Uncle Vasya goes fishing");
        } else if (dayOfWeek == 7 && temperature <= -5) {
            System.out.println("Uncle Vasya goes to the neighbour's sauna");
        } else {
            System.out.println("Uncle Vasya has a rest");
        }
    }
}
