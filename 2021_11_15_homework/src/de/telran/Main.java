package de.telran;

import de.telran.book.Book;
import de.telran.book.TechnicalBook;
import de.telran.book.LiteratureBook;
import de.telran.book.BestSeller;

public class Main {

    public static void main(String[] args) {
	Book theBible = new Book(1,"The Bible", "the prophet Moses (partially)",23);
    Book syntacticStructures = new TechnicalBook(2, "Syntactic Structures", "Noam Chomsky", 28, "Linguistics");
    Book aSportsmansSketches = new LiteratureBook(3, "A Sportsman's Sketches", "Ivan Turgenev", 26 );
    Book postOffice = new BestSeller(4, "Post Office", "Charles Bukowski", 82, 1.5);


    Book[] books = {theBible, syntacticStructures, aSportsmansSketches, postOffice};

        for (int i = 0; i < books.length; i++) {
            System.out.println(describeBook(books[i]));

        }
    }



    public static String describeBook(Book book) {
        System.out.println("The book " + book.getTitle() + " by " + book.getAuthor() + " costs " + book.getPrice());
        return " ";
    }


}
