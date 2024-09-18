package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Shelf> shelves;
    List<Reader> readers;

    public Library() {
        shelves = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            shelves.add(new Shelf());

        }
        readers = new ArrayList<>();
    }

    public boolean isTherePlaceForNewBook() {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull) {
                return true;
            }

        }
        return false;
    }

    public void addNewBook(Book book) {
        for (Shelf shelf : shelves) {
            if (!shelf.isShelfFull) {
                shelf.addBook(book);
                System.out.println("The book " + book.getTitle() + " was added");
                return;

            }
        }
        System.out.println("can't add the book " + book.getTitle() + ". there is no space left on shelf");
    }

    public void deleteBook(String title) {
        for (Shelf shelf : shelves) {
            List<Book> books = shelf.getBooks();
            for (int i = 0; i < books.size(); i++) {
                if (books.get(i).getTitle().equals(title)) {
                    books.remove(i);
                    System.out.println("The book " + title + " removed");
                    shelf.isShelfFull = (books.size() == 5);
                    return;
                }

            }
        }
    }

    public void registerReader(int id, String name) {
        readers.add(new Reader(id, name));
        System.out.println("Reader named: " + name + " registered");
    }

    public void removeReader(String name) {
        for (int i = 0; i < readers.size(); i++) {
            if (readers.get(i).name.equals(name)) {

                readers.remove(i);
                System.out.println("Reader named: " + name + " removed");
                return;
            }

        }
        System.out.println("Reader was not found");
    }

    public void searchByAuthor(String author) {

        List<String> titles = new ArrayList<>();
        for (Shelf shelf : shelves) {
            for (Book book : shelf.getBooks()) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    titles.add(book.getTitle());
                }
            }

        }
        if (!titles.isEmpty()) {
            System.out.println("The author: " + author + " wrote the following books: ");
            for (String title : titles) {
                System.out.println(title);
            }
        } else {
            System.out.println("The author: " + author + " has no books");
        }
    }
}


