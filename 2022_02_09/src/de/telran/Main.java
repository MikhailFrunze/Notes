package de.telran;

public class Main {

    public static void main(String[] args) {
        String str = "hello Java world";
        String str2 = str.substring(6);
        System.out.println(str2);
        String str3 = str.substring(6, 10);
        System.out.println(str3);
        substring(str, 6, 10);
    }

    public static void substring(String str, int from, int to) {
        for (int i = from; i < to; i++) {
            System.out.print(str.charAt(i));
        }
    }
}
