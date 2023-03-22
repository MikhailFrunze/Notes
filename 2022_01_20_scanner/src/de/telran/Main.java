package de.telran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println(getNum());
    }

    public static int getNum(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите положительное число: ");
        int num=scanner.nextInt();

        while (num<=0){
            System.out.println("Введите положительное число: ");
            num = scanner.nextInt();
        };
        return num;
    }
}
