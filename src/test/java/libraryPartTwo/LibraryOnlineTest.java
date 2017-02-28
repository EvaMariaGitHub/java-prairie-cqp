package libraryPartTwo;

import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;
import libraryPartTwo.model.Movie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class LibraryOnlineTest {

    @Test
    public void putCd_with_shipping_day() {
        //set
        CD cd = new CD("title", 60, 0);
        CD cd1 = new CD("artist1", 30, 0);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);

        LibraryOnline libraryOnline = new LibraryOnline();
        //test
        List<CD> result = libraryOnline.putCDs(cds);
        //assert
        assertEquals(2, result.size());
        CD expected = result.get(0);
        assertEquals(3, expected.getShippingDay());
    }

    @Test
    public void putDvd_with_shipping_day() {
        //set
        DVD dvd = new DVD("dvd", 120, 0, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 130, 0, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);

        LibraryOnline libraryOnline = new LibraryOnline();
        //test
        List<DVD> result = libraryOnline.putDvds(dvds);
        //assert
        assertEquals(2, result.size());
        DVD expected = result.get(0);
        assertEquals(2, expected.getShippingDay());
    }

    @Test
    public void putBook_with_shipping_day() {
        //set
        Book book = new Book("book", 50, 0);
        Book book1 = new Book("book1", 150, 0);
        Book book2 = new Book("book2", 300, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);

        LibraryOnline libraryOnline = new LibraryOnline();
        //test
        List<Book> result = libraryOnline.putBooks(books);
        //assert
        assertEquals(3, result.size());
        Book expected = result.get(0);
        assertEquals(1, expected.getShippingDay());
    }
}