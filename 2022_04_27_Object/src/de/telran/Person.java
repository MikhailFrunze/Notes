package de.telran;

import java.util.Objects;
import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + "(" + age +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person person = (Person) obj;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    public void print(){}
  public Person newPerson(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите имя:");
      String name=sc.nextLine();
      System.out.println("Возраст:");
      int age=sc.nextInt();
      return new Person(name,age);
  }
}


