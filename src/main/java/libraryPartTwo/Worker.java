package libraryPartTwo;


import libraryPartTwo.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;

    private int workingHour;

    public Worker(String name, int workingHour) {
        this.name = name;
        this.workingHour = workingHour;
    }

    public List<Book> storeBook() {
        Book book = new Book("book", 50, 0);
        Book book1 = new Book("book1", 150, 0);
        Book book2 = new Book("book2", 300, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        ILibrary library = new Library();
        if (workingHour > 7) {
            library = new LibraryOnline();
        }
        return library.putBooks(books);
    }
}
