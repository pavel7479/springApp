package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

    public void getBook() {

        System.out.println("Trying to take a book from UniLibrary" + "\n");
    }
    public void getMagazine() {
        System.out.println("Trying to take a Magazine from UniLibrary" + "\n");
    }
    public String returnBook() {
        int i =10/0;
        System.out.println("Returning a book to UniLibrary");
        return "Three musketeers";
    }
    public void returnMagazine() {
        System.out.println("Returning to take a magazine from UniLibrary" + "\n");
    }

    public void addBook(String name, Book book) {
        System.out.println("Adding a book to UniLibrary" + "\n");
    }
    public void addMagazine() {
        System.out.println("Adding a Magazine to UniLibrary" + "\n");
    }
}
