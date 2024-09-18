package FinalProject;

public class Book {
    String author;
    String title;
    int numOfPages;

    //Constractors
    public Book(String author, String title, int numOfPages) {
        this.author = author;
        this.title = title;
        this.numOfPages = numOfPages;
    }

    //Getters
    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }

    int getNumOfPages() {
        return numOfPages;
    }


}


