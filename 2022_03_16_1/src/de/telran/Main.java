package de.telran;

import javax.security.sasl.SaslServer;

public class Main {

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        int[][] rates = {
                {5,5,4,5,5},
                {3,2,3},
                {5,2,4,2,5,5,3},
                {2},
                {5,5}
        };
        int index=getIndexOfMaxAverageRow(rates);
        printStudent(names[index], average(rates[index]));
    }

    public static void printStudent(String name, double average){
        System.out.println(name + " " + average);
    }

    public static int getIndexOfMaxAverageRow(int[][] array) {
        double max = 0;
        int indexMax=0;
        for (int i = 0; i < array.length; i++) {
            double currentAverage=average(array[i]);
            if (max<currentAverage) {
            max=currentAverage;
            indexMax=i;
            }
        }
        return indexMax;
    }

    public static double average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];

        }

        return (array.length > 0) ? sum / array.length : 0;
        /*
        if (array.length>0) {
            return sum / array.length;

        } else {
            return 0;
        }*/

    }
}
