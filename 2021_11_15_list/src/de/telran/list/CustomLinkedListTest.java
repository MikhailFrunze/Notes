package de.telran.list;

import de.telran.CustomOutOfBoundsException;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

//TODO write tests for list of strings
class CustomLinkedListTest {

    CustomList<Integer> intList = new CustomLinkedList<>();
    CustomList<String> stringList = new CustomLinkedList<>();

    @Test
    public void testAddSize_threeNumbers() {
        intList.add(20);
        intList.add(10);
        intList.add(-5);

        assertEquals(3, intList.size());
    }

    @Test
    public void testAddSize_9Numbers() {
        intList.add(20);
        intList.add(10);
        intList.add(-5);
        intList.add(-5);
        intList.add(-5);
        intList.add(-5);
        intList.add(-5);
        intList.add(-5);
        intList.add(-5);

        assertEquals(9, intList.size());
    }

    @Test
    public void testAddGet_threeNumbers() {
        intList.add(20);
        intList.add(10);
        intList.add(-5);

        assertEquals(20, intList.get(0));
        assertEquals(10, intList.get(1));
        assertEquals(-5, intList.get(2));
    }

    @Test
    public void testAddGet_100RandomNumbers() {
        int[] randomNumbers = generateRandomNumbers(100);

        for (int i = 0; i < randomNumbers.length; i++) {
            intList.add(randomNumbers[i]);
        }

        assertListContents(randomNumbers);
    }

    private void assertListContents(int[] array) {
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], intList.get(i));
        }
    }

    private void assertStringListContents(String[] array) {
        for (int i = 0; i < array.length; i++) {
            assertEquals(array[i], stringList.get(i));
        }
    }

    private int[] generateRandomNumbers(int n) {
        int[] res = new int[n];
        Random rnd = new Random();

        for (int i = 0; i < n; i++) {
            res[i] = rnd.nextInt();
        }

        return res;
    }

    @Test
    public void testContains_severalNumbers_true() {
        intList.add(20);
        intList.add(10);
        intList.add(-5);

        assertTrue(intList.contains(10));
        assertTrue(intList.contains(20));
        assertTrue(intList.contains(-5));

    }

    @Test
    public void testContains_severalNumbers_false() {
        intList.add(20);
        intList.add(10);
        intList.add(-5);

        assertFalse(intList.contains(15));
    }

    @Test
    public void testSet_emptyList_throwsCustomOutOfBoundsException() {
        assertThrows(CustomOutOfBoundsException.class, () -> {
            intList.set(0, 10);
        });
    }

    @Test
    public void testGet_emptyList_throwsCustomOutOfBoundsException() {
        assertThrows(CustomOutOfBoundsException.class, () -> {
            intList.get(0);
        });
    }

    @Test
    public void testRemoveById_emptyList_throwsCustomOutOfBoundsException() {
        assertThrows(CustomOutOfBoundsException.class, () -> {
            intList.removeById(0);
        });
    }

    @Test
    public void testInsert_emptyListIndex0() {
        intList.insert(0, 5);

        assertEquals(1, intList.size());
        assertEquals(5, intList.get(0));
    }

    @Test
    public void testInsert_nonEmptyLastIndex() {
        intList.add(5);
        intList.add(10);
        intList.add(-8);

        intList.insert(3, 25);

        assertEquals(4, intList.size());
        assertListContents(new int[]{5, 10, -8, 25});
    }

    @Test
    public void testInsert_nonEmptyZeroIndex() {
        intList.add(5);
        intList.add(10);
        intList.add(-8);

        intList.insert(0, 25);

        assertEquals(4, intList.size());
        assertListContents(new int[]{25, 5, 10, -8});
    }

    @Test
    public void testInsert_nonEmptyMiddleIndex() {
        intList.add(5);
        intList.add(10);
        intList.add(-8);

        intList.insert(2, 25);

        assertEquals(4, intList.size());
        assertListContents(new int[]{5, 10, 25, -8});
    }

    @Test
    public void testRemoveById_idTwo() {
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(4);

        assertEquals(3, intList.removeById(2));

        assertListContents(new int[]{1, 3, 4});

    }

    @Test
    public void testRemoveById_idThree() {
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(4);

        assertEquals(4, intList.removeById(3));
        assertEquals(3, intList.size());

        assertListContents(new int[]{1, 3, 3});
    }

    @Test
    public void testRemoveById_idZero() {
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(4);

        assertEquals(1, intList.removeById(0));
        assertEquals(3, intList.size());
        assertListContents(new int[]{3, 3, 4});
    }

    @Test
    public void testRemoveById_idTwFour() {
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(4);

        assertThrows(CustomOutOfBoundsException.class, () -> intList.removeById(4));
    }

    //remove by Value
    @Test
    public void testRemoveByValue_one() {
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(4);

        assertTrue(intList.removeByValue(1));
        assertEquals(3, intList.size());
        assertListContents(new int[]{3, 3, 4});
    }

    @Test
    public void testRemoveByValue_three() {
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(4);

        assertTrue(intList.removeByValue(3));
        assertEquals(3, intList.size());
        assertListContents(new int[]{1, 3, 4});
    }

    @Test
    public void testRemoveByValue_twoFalse() {
        intList.add(1);
        intList.add(3);
        intList.add(3);
        intList.add(4);

        assertFalse(intList.removeByValue(2));
        assertEquals(4, intList.size());
    }

    @Test
    public void testAddSize_threeStrings() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertEquals(3, stringList.size());
    }

    @Test
    public void testAddGet_threeStrings() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertEquals("Hello", stringList.get(0));
        assertEquals("world", stringList.get(1));
        assertEquals("guys", stringList.get(2));
    }

    @Test
    public void testContains_severalStrings_true() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertTrue(stringList.contains("Hello"));
        assertTrue(stringList.contains("world"));
        assertTrue(stringList.contains("guys"));

    }

    @Test
    public void testContains_severalStrings_false() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertFalse(stringList.contains("Hi"));
    }

    @Test
    public void testInsert_emptyStringListIndex0() {
        stringList.insert(0, "Hi");

        assertEquals(1, stringList.size());
        assertEquals("Hi", stringList.get(0));
    }

    @Test
    public void testInsert_nonEmptyListLastIndex() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        stringList.insert(3, "Hi");

        assertEquals(4, stringList.size());
        assertStringListContents(new String[]{"Hello", "world", "guys", "Hi"});
    }

    @Test
    public void testInsert_nonEmptyListZeroIndex() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        stringList.insert(0, "Hi");

        assertEquals(4, stringList.size());
        assertStringListContents(new String[]{"Hi", "Hello", "world", "guys"});
    }

    @Test
    public void testInsert_nonEmptyListMiddleIndex() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        stringList.insert(2, "Hi");

        assertEquals(4, stringList.size());
        assertStringListContents(new String[]{"Hello", "world", "Hi", "guys"});
    }

    @Test
    public void testRemoveStringById_idTwo() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertEquals("guys", stringList.removeById(2));

        assertStringListContents(new String[]{"Hello", "world"});

    }



    @Test
    public void testRemoveStringById_idZero() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertEquals("Hello", stringList.removeById(0));
        assertEquals(2, stringList.size());
        assertStringListContents(new String[]{"world", "guys"});
    }


    //remove by Value
    @Test
    public void testRemoveByValue_hello() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertTrue(stringList.removeByValue("Hello"));
        assertEquals(2, stringList.size());
        assertStringListContents(new String[]{"world", "guys"});
    }


    @Test
    public void testRemoveByValue_hiFalse() {
        stringList.add("Hello");
        stringList.add("world");
        stringList.add("guys");

        assertFalse(stringList.removeByValue("hi"));
        assertEquals(3, stringList.size());
    }
}