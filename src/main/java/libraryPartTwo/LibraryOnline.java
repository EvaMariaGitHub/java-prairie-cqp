package libraryPartTwo;


import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;

import java.util.ArrayList;
import java.util.List;

public class LibraryOnline implements ILibrary {

    private List<Book> books = new ArrayList<>();
    private List<DVD> dvds = new ArrayList<>();
    private List<CD> cds = new ArrayList<>();

    @Override
    public List<Book> putBooks(List<Book> books) {
        for (Book book : books) {
            book.setShippingDay(1);
            this.books.add(book);
        }
        return this.books;
    }

    @Override
    public List<DVD> putDvds(List<DVD> dvds) {
        for (DVD dvd : dvds) {
            dvd.setShippingDay(2);
            this.dvds.add(dvd);
        }
        return this.dvds;
    }

    @Override
    public List<CD> putCDs(List<CD> cds) {
        for (CD cd : cds) {
            cd.setShippingDay(3);
            this.cds.add(cd);
        }
        return this.cds;
    }
}
