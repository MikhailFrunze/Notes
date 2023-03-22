package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] array = {5,7,14};
        PairwiseProduct pairwiseProduct = new PairwiseProduct();
        pairwiseProduct.findTwoMaxNumbers(array);
        System.out.println(pairwiseProduct.findMaxPairwiseProduct(array));
    }


}
