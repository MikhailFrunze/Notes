package de.telran;

public class Main {

    public static void main(String[] args) {
	Country america = new Country();
    america.name = "USA";
    america.capital = "Washington D.C.";
    america.officialLanguage = "English";

    Country england = new Country();
    england.name = "England";
    england.capital = "London";
    england.officialLanguage = "English";

    Country[] countries = {america, england};

        for (int i = 0; i < countries.length; i++) {
            print(countries[i]);
        }
    }

    public static void print(Country country) {
        System.out.println(country.name + " " + country.capital + " " + country.officialLanguage);
    }


}
