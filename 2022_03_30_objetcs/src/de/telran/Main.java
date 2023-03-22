package de.telran;

public class Main {

    public static void main(String[] args) {
		Manager teamLead = new Manager("TeamLead", 3000, 1000);
	Programmer p1 = new Programmer("P1", 10000, teamLead);
	Programmer p2 = new Programmer("P2", 10001, teamLead);
	QAEngineer q1 = new QAEngineer("Q1", 10002);
	QAEngineer q2 = new QAEngineer("Q2", 10003);
	Manager m1 = new Manager("M1", 10000, 1000);


	Intern i1=new Intern("Oleg", 500);

    Employee[] employees={p1,p2, q1, q2,m1, i1};
		for (int i = 0; i < employees.length; i++) {
			employees[i].paySalary();
			employees[i].doWork();
		}

		System.out.println("-----");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i].toString());
		}

    }
}
