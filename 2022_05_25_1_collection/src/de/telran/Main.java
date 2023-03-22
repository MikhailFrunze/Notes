package de.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Jack", 35);
        Person p2 = new Person("Lena", 27);
        Person p3 = new Person("John", 30);

        List<Person> list = new LinkedList<>();

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(null);
        System.out.println(list);

        System.out.println(list.get(2));
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println();

        list.remove(0);
        System.out.println(list);

        int[] array = {1, 2, 3, 4};
        array = Arrays.copyOf(array, 10);
        //array=Arrays.copyOfRange(array,0, 2);
        System.out.println(Arrays.toString(array));
        System.arraycopy(array, 0, array, 6, 2);

        System.out.println(Arrays.toString(array));

        System.out.println("-----");
        PersonLinkedList myList = new PersonLinkedList();
        myList.add(p1);
        myList.add(p2);
        myList.add(p3);
        myList.addByInsertion(0, new Person("Vasya", 5));
        myList.print();
        System.out.println(myList.get(0));
        myList.remove(0);
        myList.print();

    }




    public void getPersonsWithShortName2(List<Person> list) {
        String shortestPersonName = list.get(0).getName();
        for (Person person : list) {
            if (person.getName().length() < shortestPersonName.length()) {
                shortestPersonName = person.getName();
            }
        }
        System.out.println("Shortest Person name: " + shortestPersonName);

    }

    public List<Person> getPersonsWithShortName(List<Person> list){
        List<Person> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Person p = list.get(i);
            if (p!=null&&p.getName().length()<4){
                result.add(p);
            }
        }
        return result;
    }

    public List<Person> getPersonsWithShortName1(List<Person> list){
        List<Person> result = new ArrayList<>();
        for (Person p: list) {

            if (p!=null&&p.getName().length()<4){
                result.add(p);
            }
        }
        return result;
    }

    public String[] toArray(List<Person> list){
        if (list == null) return new String[0];
        String[] result = new String[list.size()];
int index=0;
        for (Person p:list) {
            result[index++]=(p!=null)?p.getName():null;
        }
        return result;
    }
}
