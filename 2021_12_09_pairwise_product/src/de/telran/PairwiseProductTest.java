package de.telran;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairwiseProductTest {
PairwiseProduct pairwiseProduct = new PairwiseProduct();

@Test
    public void testFindMaxPairwiseProduct_oneZeroOneNonZeroElements_Zero() {
    int[] array = {0,100};
    long res = pairwiseProduct.findMaxPairwiseProduct(array);
    assertEquals(0, res);
}
    @Test
public void testFindMaxPairwiseProduct_twoNonZeroElements_Zero() {
    int[] array = {15,100};
    long res = pairwiseProduct.findMaxPairwiseProduct(array);
    assertEquals(1500, res);
}

@Test
public void testFindMaxPairwiseProduct_twoNonZeroLargeElements_Zero() {
    int[] array = {100000,100000};
    long res = pairwiseProduct.findMaxPairwiseProduct(array);
    assertEquals(10000000000L, res);
}

@Test
public void testFindMaxPairwiseProduct_threeNonZeroElements_Zero() {
    int[] array = {5,7,14};
    long res = pairwiseProduct.findMaxPairwiseProduct(array);
    assertEquals(98, res);
}

@Test
public void testFindMaxPairwiseProduct_fourNonZeroElements_Zero() {
    int[] array = {33,50,88,101};
    long res = pairwiseProduct.findMaxPairwiseProduct(array);
    assertEquals(8888, res);
}

//TODO write additional tests

    @Test
    public void testFindTwoMaxNumbers_threeNonZeroElements_Zero() {
        int[] array = {5,7,14};
        long res = pairwiseProduct.findTwoMaxNumbers(array);
        assertEquals(98, res);
    }
}