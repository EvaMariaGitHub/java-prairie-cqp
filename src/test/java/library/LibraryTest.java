package library;

import library.model.Book;
import library.model.CD;
import library.model.DVD;
import library.model.Movie;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

public class LibraryTest {

    @Test
    public void putBooks_with_three_books() {
        //set
        Book book = new Book("book", 50);
        Book book1 = new Book("book1", 150);
        Book book2 = new Book("book2", 300);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        Library library = new Library();
        //test
        ArrayList<Book> result = library.putBooks(books);

        //assert
        assertEquals(3, result.size());
    }

    @Test
    public void putCds_with_two_cd() {
        //set
        CD cd = new CD("title", 60);
        CD cd1 = new CD("artist1", 30);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);

        Library library = new Library();
        //test
        ArrayList<CD> result = library.putCDs(cds);
        //assert
        assertEquals(2, result.size());
    }

    @Test
    public void isOpen_at_1pm() {
        //set
        Library library = new Library();
        //test
        boolean result = library.isOpen(1);
        //assert
        assertTrue(result);
    }

    @Test
    public void isOpen_at_10pm() {
        //set
        Library library = new Library();
        //test
        boolean result = library.isOpen(10);
        //assert
        assertFalse(result);
    }

    @Test
    public void putDvds_with_two_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 130, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);

        Library library = new Library();

        //test
        ArrayList<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(2, result.size());
    }

    @Test
    public void putDVDs_with_four_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 30, Movie.ACTION, true);
        DVD dvd2 = new DVD("dvd2", 60, Movie.MUSICAL, false);
        DVD dvd3 = new DVD("dvd3", 180, Movie.FUN, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd2);
        dvds.add(dvd3);
        Library library = new Library();

        //test
        ArrayList<DVD> result = library.putDvds(dvds);

        //assert
        assertEquals(3, result.size());
    }

    @Test
    public void putDvds_with_2_same_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 30, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd1);
        Library library = new Library();
        //test
        ArrayList<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(2, result.size());
        assertEquals("dvd", result.get(0).getTitle());
        assertEquals("dvd1", result.get(1).getTitle());
    }



}
