package de.telran.book;

public class LiteratureBook extends Book{

    public LiteratureBook(int id, String title, String author, int price) {
        super(id, title, author, price);
    }

    @Override
    public int getPrice() {
        int literaturePrice = price + 10;
        return literaturePrice;
    }
}
