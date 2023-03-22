package de.telran;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "{" + name +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
          >0 this больше, чем параметр
          <0 параметр больше, чем this
          0 this=парамеру
          * */
    @Override
    public int compareTo(Person o) {
       // return this.age-o.age;
return (this.age-o.age!=0)? this.age-o.age:
        this.name.compareTo(o.name);
    }
}




