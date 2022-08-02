package aop;

import org.springframework.stereotype.Component;

@Component
public class SchoolLibrary extends AbstractLibrary {


    public void getBook() {
        System.out.println("Trying to take a book from SchoolLibrary");
    }
}
