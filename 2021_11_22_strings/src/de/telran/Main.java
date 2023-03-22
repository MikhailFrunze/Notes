package de.telran;

import java.util.Arrays;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        char[] chars = {'H', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        String helloWorld = new String(chars);
        System.out.println(helloWorld);

        String str = "Hello world wussup";
        String str2 = "Hello world";

        System.out.println(str == str2);
        System.out.println(helloWorld == str);


        //charAt () -> char

        System.out.println(helloWorld.charAt(4));

        //concat() instead of +
        System.out.println(helloWorld.concat(" ").concat(str));
        // contains() -> boolean
        System.out.println(str.contains("a"));
        // endsWith() -> boolean
        System.out.println(str.endsWith("world"));
        //startsWith() -> boolean
        //the same
        //equals(Object str2) -> boolean
        System.out.println(str.equals(str2));
        System.out.println(helloWorld.equals(str2));
        //equalsIgnoreCase(String) -> boolean
        System.out.println("Hello".equalsIgnoreCase("HellO"));
        //indexOf() -> int
        System.out.println(str.indexOf('l'));
        System.out.println(str.indexOf('l', 3));
        System.out.println(str.indexOf('l', 4));
        System.out.println(str.indexOf("world"));
        //lastIndexOf() -> int
        System.out.println(str.lastIndexOf('l'));
        //length() -> int
        System.out.println(str.length());
        //split() -> String[]
        System.out.println(Arrays.toString(str.split("l")));
        //toCharArray() -> char[]
        System.out.println(Arrays.toString(str.toCharArray()));
        //toLowerCase() -> String
        System.out.println(str.toLowerCase());
        //toUpperCase() -> String
        System.out.println(str.toUpperCase());
        //charArt() -> char
        System.out.println(str.substring(6));
        System.out.println(str.substring(0, 5));

        System.out.println(reverse(str));

        isPalindrome(str);
        System.out.println(isPalindrome(str));
        System.out.println(str);
        System.out.println(howManyPatternsInString("z", str));
        System.out.println(countPatterns("H", str));
        System.out.println(cutString(str, 11));

    }

    static String reverse(String str) {
        char[] chars = str.toCharArray();

        char[] newChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {
            newChars[i] = chars[chars.length - i - 1];

        }

        return new String(newChars);
    }

    public static Boolean isPalindrome(String s) {
        return s.equals(reverse(s));
    }

    static int howManyPatternsInString(String elt, String str) {
        int howManyPatterns = 0;

        char[] chars = elt.toCharArray();

        char[] newChars = new char[chars.length];

        for (int i = 0; i < chars.length; i++) {

            if (str.contains(elt)) ;
            howManyPatterns++;
        }
        return howManyPatterns;
    }

    static int countPatterns(String pat, String str) {
        int A = pat.length();
        int B = str.length();
        int res = 0;

        for (int i = 0; i <= B - A; i++) {
            int j;
            for (j = 0; j < A; j++) {
                if (str.charAt(i + j) != pat.charAt(j)) {
                    break;
                }

            }

            if (j == A) {
                res++;
                j = 0;
            }

        }
        return res;
    }

    static String cutString(String str, int n) {
        char[] chars = str.toCharArray();
        if (n > str.lastIndexOf(" ")) {
            return str;
        } else if (n> str.indexOf(" ")){
            return str = str.substring(0,str.lastIndexOf(" "));

        }
        else {
            return str.substring(0, str.indexOf(" "));
        }


    }

}


