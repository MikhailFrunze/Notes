package de.telran;

public class Main {

    public static void main(String[] args) {
        int day = 6;
        int weatherTemperature = 23;

        if(day == 6 && weatherTemperature >= 23 && weatherTemperature <= 29){
            System.out.println("Vasya goes fishing");
        } else if (day == 7 & weatherTemperature <= -5) {
            System.out.println("Vasya goes to the neighbour's sauna");
        } else if(day <= 5){
            System.out.println("Vasya goes to work");
        }
    }
}
