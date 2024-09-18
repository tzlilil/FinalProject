package FinalProject;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    int id;
    String name;
    List<String> books;

    public Reader(int id, String name) {
        this.id = id;
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void readBook(String title) {
        books.add(title);
    }
}
