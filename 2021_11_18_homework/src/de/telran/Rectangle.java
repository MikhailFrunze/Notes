package de.telran;

public class Rectangle extends Shape{
    public static void draw (int length, int width) {

        char printStr = '*';
        String separator = " ";

        for (int i = 0; i < length; i++) {

            for (int j = 0; j < width; j++)

                if (i == 0 || j == 0 || i == length - 1 || j == width - 1)
                    System.out.print(printStr + separator);
                else
                    System.out.print(separator + separator);

            System.out.println();
        }
        System.out.println("This is a rectangle");
    }
}
