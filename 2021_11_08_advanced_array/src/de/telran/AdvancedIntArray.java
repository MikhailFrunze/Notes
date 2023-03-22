package de.telran;

public class AdvancedIntArray {

    String name;
    int[] getSource;

    private int[] source;

    public AdvancedIntArray(String name, int[] getSource){
        this.name = name;
        this.source = getSource;
    }

    public AdvancedIntArray(int initialSize) {
        source = new int[initialSize];

    }

    public void set(int index, int value) {
        source[index] = value;
    }

    public int get(int index) {
        return source[index];
    }


    public int size() {

        return source.length;
    }

    public void append(int elt) {
        int[] newSource = new int[source.length + 1];

        for (int i = 0; i < source.length; i++) {
            newSource[i] = source[i];

        }
        newSource[newSource.length - 1] = elt;

        source = newSource;
    }

    public void insert(int index, int elt) {
        int[] newSource = new int[source.length + 1];
        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];

        }
        newSource[index] = elt;

        for (int i = index; i <source.length ; i++) {
            newSource[i+1] = source[i];

        }
        source = newSource;
    }

    public void delete(int index) {
        int[] newSource = new int[source.length - 1];

        for (int i = 0; i < index; i++) {
            newSource[i] = source[i];
            
        }

        for (int i = index + 1; i < source.length ; i++) {
            newSource[i - 1] = source[i];
            
        }

        for (int i = index; i <newSource.length ; i++) {
            newSource[i] = source[i + 1];

        }

        source = newSource;

    }

    public boolean contains(int elt) {
        for (int i = 0; i < source.length; i++) {
            if (source[i] == elt)
                return true;

        }
        return false;
    }

    public void println(int[] getSource) {
        //TODO - print 'this' advanced array out into the console
        for (int i = 0; i < source.length; i++) {
            System.out.print(source[i] + " ");

        }
        System.out.println();
    }
}
