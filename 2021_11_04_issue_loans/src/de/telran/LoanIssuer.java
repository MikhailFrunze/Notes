package de.telran;

public class LoanIssuer {
    String name;
    String surname;
    boolean isLazy;
    boolean isKind;

    public LoanIssuer(String name, String surname, boolean isLazy, boolean isKind) {
        this.name = name;
        this.surname = surname;
        this.isLazy = isLazy;
        this.isKind = isKind;
    }

    public boolean toProvide(LoanUser user, int annualSalary, int age) {
        if (isLazy && annualSalary > 20000) {
            return true;
        } else if (!isLazy && isKind && annualSalary > 20000 && age <= 70) {
            return true;
        } else if (!isLazy && isKind == false && annualSalary > 20000 && age <= 50) {
            return true;
        } else return false;
    }
}
