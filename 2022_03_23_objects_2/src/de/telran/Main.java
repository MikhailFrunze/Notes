package de.telran;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle v1 = new Vehicle("r288BE", "bus");
        Vehicle v2 = new Vehicle("k654BS", "car");
        Vehicle v3 = new Vehicle("h432BO", "truck");

        System.out.println(v1.type);

        Vehicle[] vehicles={v1, v2, v3, new Vehicle("y12", "car")};
        for (int i = 0; i < vehicles.length; i++) {
            System.out.println(vehicles[i]);
        }
        System.out.println("-----");
        System.out.println(v1.number);
        System.out.println(vehicles[0].number);
    }

}
