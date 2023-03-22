package de.telran;

public class Main {

    public static void main(String[] args) {
        String helloWorld = "Hello world";
        String res = "";

        String[] strs = new String[] {"Hello world"};

        long currentTime = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            res += helloWorld;
        }
        long delta = System.currentTimeMillis() - currentTime;

        System.out.println(delta);

        StringBuilder sb = new StringBuilder();

        currentTime = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            sb.append(helloWorld);

        }
        res = sb.toString();
        delta = System.currentTimeMillis() - currentTime;

        System.out.println(delta);

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            res = res += helloWorld;
        }
        delta = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Time taken to concatenate 100000 Strings using + operator (in millis) : " + delta);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            res.concat(res);
        }
        delta = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Time taken to concatenate 100000 Strings using concat method (in millis) : " + delta);

        StringBuilderConcatenator builder = new StringBuilderConcatenator();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            builder.concat(strs);
        }
        delta = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Time taken to concatenate 100000 Strings using StringBuilder append in millis) : " + delta);

        StringBuffer buffer = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            buffer.append(i);
        }
        delta = (System.currentTimeMillis() - startTime) / 1000;
        System.out.println("Time taken to concatenate 100000 Strings using StringBuffer (in millis) : " + delta);



    }

}

