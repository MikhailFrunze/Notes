package de.telran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/*RandomArray randomArray = new RandomArray();
    randomArray.createArray(5);
    GrowingOrderArrray growingOrderArrray = new GrowingOrderArrray();
    growingOrderArrray.createArray(5);*/

        int choice=inputChoice();
        ArrayServiceFactory factory = new ArrayServiceFactory();
        CreateArrayService createArrayService = factory.getArrayService(choice);
        ArrayGenerator arrayGenerator = new ArrayGenerator();
        System.out.println(arrayGenerator.generate(createArrayService));

    }

    public static int inputChoice(){
        int choice;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Which service to use to generate array?");
            System.out.println("1.Random Array  2.Growing Order Array");
            choice = sc.nextInt();
        }while (choice<1 || choice>2);
        sc.close();
        return choice;

    }
}
