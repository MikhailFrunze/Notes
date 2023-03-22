package de.telran;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Ivan", "Ivanov");
        System.out.println(p1);
        Account a1 = new Account("DE1234567", p1, 1000000);
        System.out.println(a1);


        Account a2 = new Account("DE5714335088", new Person("Irina", "Ivanova"), 15000);

        Account[] accounts = {a1, a2,
                new Account("DE5714335089", new Person("Oleg", "Olegov"), 1000)};

        BankProcessing processing = new BankProcessing(accounts);
        System.out.println(processing);

        System.out.println(a1.secureToString());
        System.out.println(processing.getBankAccounts());
    }
}
