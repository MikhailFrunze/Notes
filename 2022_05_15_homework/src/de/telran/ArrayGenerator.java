package de.telran;

import java.util.Scanner;

public class ArrayGenerator {
    public int[] generate(CreateArrayService service) {
        return service.createArray(5);
    }
}
