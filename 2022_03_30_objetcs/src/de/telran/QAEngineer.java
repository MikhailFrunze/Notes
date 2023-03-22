package de.telran;

public class QAEngineer extends Employee {


    public QAEngineer(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "QAEngineer " +  getName() + " (" + getSalary() + ')';

    }

    public void doWork(){
        System.out.println("I am a QA Engineer and I check the programs");
    }

    public void paySalary(){
        System.out.println(getName() + " get " + getSalary());
    }
}
