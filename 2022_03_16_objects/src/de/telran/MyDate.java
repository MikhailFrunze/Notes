package de.telran;

public class MyDate {

    int day;
    int month;
    int year;

    public MyDate(int d, int m, int y){
        this.day=day;
        this.month=month;
        this.year=year;
    }


    public String toString() {
        return day + "-" + month + "-" + year;
    }
}


