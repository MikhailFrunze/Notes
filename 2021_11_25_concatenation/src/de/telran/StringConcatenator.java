package de.telran;

public class StringConcatenator implements IConcatenator{
    @Override
    public String concat(String[] str) {
        //TODO cocnatenate the strings just adding them to each other

        String res = "";
        for (int i = 0; i < 100000; i++) {
            res += str[i];
        }
        return res;
    }
}
