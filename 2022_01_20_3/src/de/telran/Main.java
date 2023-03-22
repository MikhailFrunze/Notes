package de.telran;

public class Main {

    public static void main(String[] args) {
        String str="qwert";
        String str1="1234567890";
        System.out.println(str.length());
        System.out.println(str1.length());
        System.out.println("----------- charAt");
        char ch=str1.charAt(1);
        System.out.println(ch);
        ch= str1.charAt(str1.length()-1);
        System.out.println(ch);

        System.out.println("---- String to column ------");
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }
}
