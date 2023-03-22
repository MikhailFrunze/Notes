package de.telran;

public class Vehicle {
    String type;
    String number;


    public Vehicle(String number, String type) {
        this.type = type;
        while (number.length()<6){
            number=number+'Q';
        }
        this.number=number;
    }

    @Override
    public String toString() {
        return this.type + "[" + number + "]";
    }

    public String getNumber(){
        return number;
    }
}
