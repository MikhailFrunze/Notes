package de.telran;

public class PairwiseProduct {

    /**
     * The method must return the max pairwise product from the array
     * @param array with non-negative numbers
     * @return
     */
    // {12,1,8,10,3} -> 120
    public long findMaxPairwiseProduct(int[] array) {
        long max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                long mul = (long) array[i] * array[j];
                if (mul>max)
                    max = mul;

            }

        }
        return max;
    }



    //TODO optimize the solution by finding two max numbers from the array

    public long findTwoMaxNumbers (int[] array){
        long res = 0;
        long maxOne = 0;
        long maxTwo = 0;
        for (int num : array) {
if (maxOne<num) {
    maxTwo = maxOne;
    maxOne = num;
}else if (maxTwo < num){
    maxTwo = num;

}
res = maxOne * maxTwo;
        }
        return res;
    }
}
