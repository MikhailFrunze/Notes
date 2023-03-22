package de.telran;

public class StringBufferConcatenator implements IConcatenator {
    @Override
    public String concat(String[] str) {
        //TODO concatenate the strings using StringBuffer
        StringBuffer NewStringBuffer = new StringBuffer();
        NewStringBuffer.append(str);
        return concat(str);
    }
}
