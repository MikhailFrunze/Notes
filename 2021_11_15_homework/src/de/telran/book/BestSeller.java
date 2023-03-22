package de.telran.book;

public class BestSeller extends LiteratureBook {

    double coef;

    public BestSeller(int id, String title, String author, int price, double coef) {
        super(id, title, author, price);
        this.coef = coef;
    }

    public double getCoef() {
        return coef;
    }

    @Override
    public int getPrice() {
        return (int) (coef * super.getPrice());
    }
}
