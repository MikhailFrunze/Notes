package de.telran;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
    static int binarySearch(int[] array, int number) {
        int minIndex = 0;
        int maxIndex = array.length - 1;

int middleIndex = 0;

//if (number > array[maxIndex])
  //  return -array.length - 1;
        while (minIndex <= maxIndex){
            middleIndex = (maxIndex + minIndex) / 2;

            if (array[middleIndex] < number)
                minIndex = middleIndex + 1;
            else if (array[middleIndex] > number)
                maxIndex = middleIndex - 1;
            else
                return middleIndex;
        }

return -(minIndex + 1);
    }
}
