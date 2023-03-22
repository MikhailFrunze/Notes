package de.telran.list;

import de.telran.CustomOutOfBoundsException;

import java.util.Iterator;

public abstract class AdvancedArrayList<T> implements CustomList<T> {
    private T[] source;

    public AdvancedArrayList(int initialSize) {
        source = (T[]) new Object[initialSize];
    }

    @Override
    public void set(int index, T value) {
        source[index] = value;
    }

    @Override
    public T get(int index) {
        return source[index];
    }

    @Override
    public int size() {
        return source.length;
    }

    public void insert(int index, T elt) {
        T[] newSource = (T[]) new Object[source.length + 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }
        newSource[index] = elt;

        for (int i = index + 1; i < newSource.length; i++) {
            newSource[i] = source[i - 1];
        }

        source = newSource;
    }

    @Override
    public boolean contains(T elt) {
        for (int i = 0; i < source.length; i++) {
            if (source[i].equals(elt))
                return true;
        }

        return false;
    }

    @Override
    public T removeById(int index) {
        if (index < 0 || index >= source.length)
            throw new CustomOutOfBoundsException();

        T[] newSource = (T[]) new Object[source.length - 1];

        T res = source[index];

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
        }

        for (int i = index + 1; i < source.length; i++) {
            newSource[i - 1] = source[i];
        }

        source = newSource;
        return res;
    }

    @Override
    public void add(T value) {
        insert(source.length, value);
    }

    @Override
    public void println() {
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");
        }
        System.out.println();
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator<>(source);
    }

    private static class ListIterator<E> implements Iterator<E>{

        private final E[] array;
        int currentId = 0;

        public ListIterator(E[] array) {
            this.array = array;
        }

        @Override
        public boolean hasNext() {
            return currentId < array.length;
        }

        @Override
        public E next() {
            E res = array[currentId];
            currentId++;
            return res;
        }
    }
}
