package de.telran;

public class Main {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int d = 1;

        while (a <= b) {
            System.out.print(a + " ");
            a += d;
        }

        int a1 = 7;
        int b1 = 5;

        while (a1 >= b1) {
            System.out.print(a1 + " ");
            a1 -=d;
        }
//далее я не уверен
        int b2 = 1;
        int a2 = 50;
        int c2 = 5;
        int d2 = 7;
        int e2 = 13;

        while (b2 <= a2) {
            System.out.print( b2 + " ");
            b2 += c2 | d2 | e2;
        }

    }
}
