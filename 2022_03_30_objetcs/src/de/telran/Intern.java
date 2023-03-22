package de.telran;

public class Intern extends Employee{
    public void doWork(){
        System.out.println("Стараюсь не мешать");
    }
    public Intern(String name, double salary) {
        super(name, salary);
    }
}
