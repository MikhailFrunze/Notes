package de.telran;

public class Main {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hi";
        System.out.println(findFirstDiff2(str1, str2));
        System.out.println(findFirstDiff2(str1, str1));
        printEvenString(str1);

        System.out.println();

        System.out.println(getEvenString("012345678"));
        /*twoStrings(str1, str2);*/
    }

    /* public static void twoStrings(String str1, String str2) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = 0; j < str2.length(); j++) {
                if (str2.charAt(j) != str1.charAt(i)) {
                    System.out.println(str2.indexOf(j));

}

            }
            break;
        }
    } */

    public static int findFirstDiff(String str1, String str2) {
        if (str1.equals(str2)) {
            return -1;
        }
        int i = 0;
        while (i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i)) {
            i++;
        }
        return i;
    }

    public static int findFirstDiff2(String str1, String str2) {
        if (str1.equals(str2)) {
            return -1;
        }
        int i;
        for (i = 0; i < str1.length() && i < str2.length() && str1.charAt(i) == str2.charAt(i); i++) ;
            return i;

    }

    public static void printEvenString (String str) {
        for (int i = 0;  i < str.length(); i++) {
            if ( i % 2 == 0) {
                System.out.print(str.charAt(i));
            }
        }
    }

    public static String getEvenString(String str){
        String rez="";
        for (int i = 0; i <str.length() ; i++) {
            if (i%2==0){
                rez+=str.charAt(i);
            }

        }
        return rez;
    }

}

