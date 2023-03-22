package de.telran.list;

import java.util.Iterator;

/**
 * The interface describes a data structure called List. It is an ordered data structure.
 */


public interface CustomList<T>extends Iterable<T> {
    /**
     * The method swaps the value on the index position
     * @param index the position
     * @param value a new value for the index position
     * @throws de.telran.CustomOutOfBoundsException if index < 0 or index >= size
     */
    void set(int index, T value);

    /**
     * The method gets the value on the index position
     * @param index the position, whose value to be returned
     * @return the number by its position
     */

    public T get(int index);

    /**
     *
     * @return the number of elements in the list
     */

    int size();

    /**
     *
     * @param value to be found
     * @return whether the value is in the list
     */

    boolean contains(T value);

    /**
     * removes the value by its position. The elements which are after the index move to the left by 1 position
     * @param index of the value to remove
     *              @throws de.telran.CustomOutOfBoundsException if index < 0 or index >= size
     */

    public T removeById(int index);

    /**
     * removes the element by its value. Only one element will be removed if exists.
     * @param value
     */

    boolean removeByValue(T value);

    /**
     * Add an element to the end of the list
     * @param value
     */

    void add(T value);

    /**
     * Inserts the value to the index place. All the elements which are after the index move to the right by 1 position
     * @param index the place to insert
     * @param value the element to insert
     *              @throws de.telran.CustomOutOfBoundsException if index < 0 or index >= size
     */

    void insert(int index, T value);

    /**
     * prints the element
     * @throws de.telran.CustomOutOfBoundsException if index < 0 or index > size
     */

    void println();

    /**
     * The method must return an iterator, which iterates the list from the most left element (first) to the
     * most right element
     * @return
     */


}
