package de.telran;

public class Main {

    public static void main(String[] args) {
	Person p1=new Person("Ivan", 20);
    Person p2=new Person("Oleg", 20);
    Person p3=new Person("Ivan", 30);

    String st1="hello";
    String st2="hello";
    String st3=new String("hello");

    Person p4=p1.newPerson();
        System.out.println(p4);

        System.out.println(st1==st2);
        st3=st3.intern();
        System.out.println(st1==st3);
        System.out.println(st1.equals(st3));


    }
}
