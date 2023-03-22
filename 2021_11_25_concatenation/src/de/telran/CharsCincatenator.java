package de.telran;

public class CharsCincatenator implements IConcatenator{
    @Override
    public String concat(String[] strs) {
        int length = 0;
        for (int i = 0; i < strs.length; i++) {
            length += strs[i].length();

        }

        char[] chars = new char[length];

        int index = 0;

        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                chars[index] = strs[i].charAt(j);
                index++;
            }

        }
        return new String(chars);
    }
}
