package de.telran;

public class Main {

    public static void main(String[] args) {
        factorial(5);
        System.out.println(factorial(5));
        printNumber(5);

        int[] array = new int[]{5,7,14,33};
    }

    public static int factorial(int num) {
        if (num >= 0) ;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;

        }
        return factorial;
    }

    public static int factorial1(int num) {
        if (num < 2) {
            return 1;
        } else {
            int res = num * factorial1(num - 1);
            return res;
        }
    }

    public static void printNumber(int num) {
        if (num<2){
            System.out.println("Hello world ");
            System.out.println();
        } else {
            System.out.println("Hello world ".repeat(num));

        }

    }

    public static void print(String str, int n){
        if (n!=1){
            print(str, n-1);
        }
        System.out.println(str);
        
    }

}
