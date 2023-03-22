package de.telran;

public class EmployeeTeam {

    private int capacity = 2;
    private int curIndex = 0;
    Employee[] team = new Employee[capacity];

    public void add(Employee e) {
        if (curIndex == capacity) {
            increaseToSize(capacity * 2);
        }
        team[curIndex++] = e;
    }


    private void increaseToSize(int size) {

    }

    public Employee[] getTeam() {

        return team;
    }
}
