package de.telran;

public class ArrayServiceFactory {
    public CreateArrayService getArrayService(int choice) {
        switch (choice) {
            case 1:
                return new RandomArray();
            case 2:
                return new GrowingOrderArrray();
        }
        return null;
    }
}
