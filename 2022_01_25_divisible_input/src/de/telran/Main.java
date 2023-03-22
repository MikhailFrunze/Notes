package de.telran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*divisibleInputWithScanner(5, 7);*/
        int num1;
        int num2;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Insert the first number:");
            num1=scanner.nextInt();
            System.out.println("Input the second number:");
            num2=scanner.nextInt();
        } while (num1!=0 && num2!=0 && num1%num2!=0);
        if (num1!=0&&num2!=0) {
            System.out.println(num1 + " is divisible by " + num2);
        }
    }

   /* public static void divisibleInputWithScanner(int num1, int num2) {


        if (num1 % num2 == 0) {
            System.out.println("num1 is divisible by num2");
        } else if (num1 % num2 != 0) {
            System.out.println("Enter other 2 numbers: ");
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(num);
            num2 = num;

            if (num1 % num2 == 0)
                System.out.println("num1 is divisible by num2");

            if (num1 % num2 != 0)
                System.out.println("Enter other 2 numbers: ");

        }


    }*/



}
