package de.telran;

public class Manager extends Employee {
    private double bonus;
    private int capacity = 2;
    private int curIndex = 0;
    EmployeeTeam team=new EmployeeTeam();

    public void add(Employee e){
        team.add(e);
    }

    /*public Manager(String name, double salary, double bonus, Employee[] team) {
        super(name, salary);
        this.team = team;
        this.bonus = bonus;
    }*/

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void add(Employee e) {
        if (curIndex == capacity) {
            increaseToSize(capacity * 2);
        }
        team[curIndex++] = e;
    }

    public Employee[] getTeam(){
        return team.getTeam();
    }

    private void increaseToSize(int size) {
        if (size > capacity) {
            Employee[] temp = new Employee[size];
            for (int i = 0; i < team.length; i++) {
                temp[i] = team[i];
            }
            capacity = size;
            team = temp;
        }
    }

    public Employee[] getTeam() {
        return team;
    }


    @Override
    public String toString() {
        return super.toString() + " The bonus is " + bonus;
    }



    public void doWork() {
        System.out.println("I am a Manager and I get big salary");
        System.out.println("and I say work to my team");
        Employee[] temp=team.getTeam();
        for (int i = 0; i < team.length; i++) {
            team[i].doWork();
        }
    }

    public void paySalary() {
        System.out.println(getName() + " get " + getSalary());
    }
}
