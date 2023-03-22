package de.telran;

public class Main {

    public static void main(String[] args) {
        MyDate date2 = new MyDate(5, 7, 1950);
        String st;
        MyDate date1 = new MyDate(18, 11, 2000);
        Person person1 = new Person("Ivan", "Ivanov", date1);
        Person person2 = new Person("Elena", "Ivanova", date1);
        Person[] people = {person1, person2};


        for (int i = 0; i < people.length; i++) {
            print(people[i]);

        }
        System.out.println("-----");
        for (int i = 0; i < people.length; i++) {
            people[i].shortPrint();
        }
    }


    public static void print(Person person) {
        System.out.println(person.firstName + " " + person.lastName);
        System.out.println("[" + person.birthday.day + "/" + person.birthday.month + "/" + person.birthday.year + "]");
    }
}
