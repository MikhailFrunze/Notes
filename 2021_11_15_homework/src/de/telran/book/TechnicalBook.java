package de.telran.book;

public class TechnicalBook extends Book {

    public TechnicalBook(int id, String title, String author, int price, String scientificField) {
        super(id, title, author, price);
        this.scientificField = scientificField;
    }

    String scientificField;

    public String getScientificField() {
        return scientificField;
    }
}
