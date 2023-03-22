package de.telran;

public class Account {
    private String iban;
    private Person client;
    private double balance;

    public Account(String iban, Person client, double balance) {
        this.iban = iban;
        this.client = client;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The IBAN: " + iban + ". The client: " + client.toString() + ". The balance: " + balance;
    }

    public String getIBAN() {
        return iban;
    }

    public Person getClient() {
        return client;
    }

    public double getBalance() {
        return balance;
    }

    /*public String secureToString() {
        return iban.substring(0, 3) + "*********" + iban.substring(iban.length() - 2);
    }*/

    public String secureToString() {
        return client.toString() + '[' + getSecureIban() + "] " + balance;
    }

    private String getSecureIban() {
        String rez = "";
        for (int i = 0; i < iban.length(); i++) {
            if (i < 2 || i >= iban.length() - 2) {
                rez += iban.charAt(i);
            } else {
                rez += '*';
            }
        }
        return rez;
    }


}
