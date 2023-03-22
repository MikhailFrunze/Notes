package de.telran;

public class Main {

    public static void main(String[] args) {
	int[] array = new int [3];
    array[0] = 10;
    array[1] = 5;
    array[2] = 20;

    int zeroElt = array[0];
        System.out.println(zeroElt);

    AdvancedIntArray advancedIntArray = new AdvancedIntArray(3);
advancedIntArray.set(0,5);
advancedIntArray.set(1,5);
advancedIntArray.set(2,20);

AdvancedIntArray array1 = new AdvancedIntArray(advancedIntArray.name, advancedIntArray.getSource);

int advancedZeroElt = advancedIntArray.get(0);
        System.out.println(advancedZeroElt);

        advancedIntArray.append(99);
        System.out.println(advancedIntArray.get(3));

        advancedIntArray.insert(3,11);
        System.out.println(advancedIntArray.get(3));

        advancedIntArray.delete(2);//{10,5,99}
        System.out.println(advancedIntArray.get(2));

        System.out.println(advancedIntArray.contains(11));

        advancedIntArray.println(advancedIntArray.getSource);
        System.out.print(advancedIntArray.get(advancedIntArray.size()));


    }
}
