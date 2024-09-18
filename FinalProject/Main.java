package FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("For adding a book - press 1");
            System.out.println("For deleting a book - press 2");
            System.out.println("For registering new reader - press 3");
            System.out.println("For removing a reader - press 4");
            System.out.println("For searching books by author - press 5");
            System.out.println("For exit - press 6");
            System.out.println("Please enter your choice:");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    if (!library.isTherePlaceForNewBook()) {
                        System.out.println("Can't add a book, there is no space left in the library");
                        break;
                    }
                    System.out.println("Enter author's name: ");
                    String author = input.nextLine();
                    System.out.println("Enter book's title: ");
                    String title = input.nextLine();
                    System.out.println("Enter number of pages: ");
                    int numOfPages = input.nextInt();
                    input.nextLine();
                    library.addNewBook(new Book(author, title, numOfPages));
                    break;

                case 2:
                    System.out.println("Enter the title of the book you want to delete");
                    String delete = input.nextLine();
                    library.deleteBook(delete);
                    break;
                case 3:
                    System.out.println("Enter a reader id: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.println("Enter reader name: ");
                    String name = input.nextLine();
                    library.registerReader(id, name);
                    break;

                case 4:
                    System.out.println("Enter the name of the reader you want to remove: ");
                    String remove = input.nextLine();
                    library.removeReader(remove);
                    break;

                case 5:
                    System.out.println("Enter the author name: ");
                    String autherName = input.nextLine();
                    library.searchByAuthor(autherName);
                    break;

                case 6:
                    input.close();
                    System.out.println("Bye");
                    return;

                default:
                    System.out.println("invalid number. enter a valid choice between 1-6");
            }
        }
    }
}
