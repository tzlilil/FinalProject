package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Shelf {
    List<Book> books;
    boolean isShelfFull;

    //constructors

    public Shelf() {
        books = new ArrayList<>(5);
        isShelfFull = false;

    }

    public void addBook(Book book) {
        if (books.size() < 5) {
            books.add(book);

            System.out.println("The book " + book.getTitle() + " was added to shelf");
        }
        if (books.size() == 5) {
            isShelfFull = true;
        } else {
            System.out.println("The shelf is full. can't add any more books");
        }
    }

    public void replaceBook(int i1, int i2) {
        int index1 = i1 - 1;
        int index2 = i2 - 1;
        if (index1 > books.size() || index2 > books.size()) {
            System.out.println("one of the locations is empty or exceeded bounds");
            return;
        }
        Book newBook = books.get(index1);
        books.set(index1, books.get(index2));
        books.set(index2, newBook);
        System.out.println("The books in the following location were swapped:  " + i1 + i2);
    }

    public List<Book> getBooks() {
        return books;
    }


}
