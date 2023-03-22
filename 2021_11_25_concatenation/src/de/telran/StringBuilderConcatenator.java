package de.telran;

public class StringBuilderConcatenator implements IConcatenator{
    @Override
    public String concat(String[] strs) {
        //TODO concatenate the strings using stringbuilder
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i <strs.length; i++) {
            sb.append(strs[i]);
        }
        return sb.toString();
    }

}
