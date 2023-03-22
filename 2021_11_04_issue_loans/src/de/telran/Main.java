package de.telran;

public class Main {

    public static void main(String[] args) {

        LoanUser vasya = new LoanUser("Vasya", "Vasin",20,30000);
        LoanUser petya = new LoanUser("Petya", "Petin", 33, 25000);
        LoanUser masha = new LoanUser("Masha", "Mashina", 51, 33000);

        LoanUser[] users = new LoanUser[]{vasya, petya, masha};

        LoanIssuer lazyKindIssuer = new LoanIssuer("Johan", "Kruff", true, true);
        LoanIssuer hardworkingKindIssuer = new LoanIssuer("Joe", "Biden", false, true);
        LoanIssuer hardworkingEvilIssuer = new LoanIssuer("Boris", "Johnson", false, false);
        LoanIssuer lazyEvilIssuer = new LoanIssuer("Emanuel", "Macron", true, false);

        LoanIssuer[] clerks = {lazyKindIssuer, hardworkingKindIssuer, hardworkingEvilIssuer, lazyEvilIssuer};


        System.out.println(lazyKindIssuer.toProvide(vasya, vasya.annualSalary, vasya.age));
        System.out.println(lazyKindIssuer.toProvide(petya, petya.annualSalary, petya.age));
        System.out.println(lazyKindIssuer.toProvide(masha, masha.annualSalary, masha.age));
        System.out.println(hardworkingKindIssuer.toProvide(vasya, vasya.annualSalary, vasya.age));
        System.out.println(hardworkingKindIssuer.toProvide(petya, petya.annualSalary, petya.age));
        System.out.println(hardworkingKindIssuer.toProvide(masha, masha.annualSalary, masha.age));
        System.out.println(hardworkingEvilIssuer.toProvide(vasya, vasya.annualSalary, vasya.age ));
        System.out.println(hardworkingEvilIssuer.toProvide(petya, petya.annualSalary, petya.age ));
        System.out.println(hardworkingEvilIssuer.toProvide(masha, masha.annualSalary, masha.age ));
        System.out.println(lazyEvilIssuer.toProvide(vasya, vasya.annualSalary, vasya.age ));
        System.out.println(lazyEvilIssuer.toProvide(petya, petya.annualSalary, petya.age ));

        for (int i = 0; i < clerks.length; i++) {
            for (int j = 0; j < users.length; j++) {
                boolean isProvided = clerks[i].toProvide(users[j]);
                if (isProvided)
                System.out.println("The clerk " + clerks[i].name + " " + clerks[i].surname + "provides loan to the user "
                + users[j].name + " " + users[j].surname);
                else
                    System.out.println("The clerk " + clerks[i].name + " " + clerks[i].surname + "does not provide loan to the user "
                            + users[j].name + " " + users[j].surname);

            }

        }

    }


}
