package de.telran;

public class Main {

    public static void main(String[] args) {

        System.out.println("----------------- while ----------");
        int i=7;
        while (i<5) {
            System.out.println(i);
            i++;
        }
        System.out.println("after while " + i);

        System.out.println("---- do....while-------");
        int j=7;
        do{
            System.out.println(j);
            j++;
        } while (j<5);
        System.out.println("after do....while " + j);
    }

    public static void printNums() {
        for (int i = 20; i >= 10; i--) {
            System.out.println(i);
        }
    }

    public static void countSumFrom0To100() {
        int res=0;
        for (int i = 1; i <=100 ; i++) {
            res=res+i;
        }
        System.out.println(res);
    }




}
