package de.telran;

import java.util.Arrays;

public class BankProcessing {
    private Account[] bankAccounts;

    public BankProcessing(Account[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Account[] getBankAccounts() {
        return bankAccounts;
    }

    @Override
    public String toString() {
        String rez = "[";
        for (int i = 0; i < bankAccounts.length; i++) {
            rez += bankAccounts[i].toString() + ",  " + System.lineSeparator();
        }
        rez += "]";
        return rez;
    }

    public void clients() {
        for (int i = 0; i < bankAccounts.length; i++) {
            System.out.print(bankAccounts[i] + " ");
        }
        System.out.println();
    }

    public String toSecureString() {
        String rez = "[";
        for (int i = 0; i < bankAccounts.length; i++) {
            rez += bankAccounts[i].secureToString() + ", " + System.lineSeparator();

        }
        rez += "]";
        return rez;
    }

    public double getSumOfAccounts() {
        double res = 0;
        for (int i = 0; i < bankAccounts.length; i++) {
            res += bankAccounts[i].getBalance();
        }
        return res;
    }

    /*public void secureToString() {
        String[] account = new Account().secureToString();
        for (int i = 0; i < account.length; i++) {
            System.out.println(account[i]);
        }

    }

    public double accountsBalances () {
        double sum = 0;
        double balance = new Account().getBalance();
        return sum = sum + balance;
    }*/
}
