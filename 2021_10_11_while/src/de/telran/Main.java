package de.telran;

public class Main {

    public static void main(String[] args) {
        int a = 10;

        while (a >= 0){
            System.out.print(a + "  ");
            a--;
        }

        //print out all numbers between 1 and 10
        int i = 1;

        while (i <= 10){
            System.out.print(i + "  ");
            i++;
        }
        System.out.println();

        // print out all even numbers between 20 and 0

        i = 20;

        while (i >= 0){
            System.out.print(i + "  ");
            i -= 2;//i = i - 2;
        }
        System.out.println();
        // count the sum of an arithmetical progression from 1 to 87


        int sum = 0;
        int currentNumber = 1;
        while (currentNumber <= 87) {
            sum += currentNumber;
            currentNumber++;
        }
        System.out.println(sum);
    }

}
