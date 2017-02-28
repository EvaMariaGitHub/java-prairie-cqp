package libraryPartTwo;

import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;
import libraryPartTwo.model.Movie;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;


public class LibraryTest {

    @Test
    public void putBooks_with_three_books() {
        //set
        Book book = new Book("book", 50, 0);
        Book book1 = new Book("book1", 150, 0);
        Book book2 = new Book("book2", 300, 0);
        ArrayList<Book> books = new ArrayList<>();
        books.add(book);
        books.add(book1);
        books.add(book2);
        Library library = new Library();
        //test
        List<Book> result = library.putBooks(books);

        //assert
        assertEquals(3, result.size());
    }

    @Test
    public void putCds_with_two_cd() {
        //set
        CD cd = new CD("title", 60, 0);
        CD cd1 = new CD("artist1", 30, 0);
        ArrayList<CD> cds = new ArrayList<>();
        cds.add(cd);
        cds.add(cd1);

        Library library = new Library();
        //test
        List<CD> result = library.putCDs(cds);
        //assert
        assertEquals(2, result.size());
    }


    @Test
    public void putDvds_with_two_dvd() {
        //set
        DVD dvd = new DVD("dvd", 120, 0, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 130, 0, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);

        Library library = new Library();

        //test
        List<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(2, result.size());
    }

    @Test
    public void putDVDs_with_four_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, 0, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 30, 0, Movie.ACTION, true);
        DVD dvd2 = new DVD("dvd2", 60, 0, Movie.MUSICAL, false);
        DVD dvd3 = new DVD("dvd3", 180, 0, Movie.FUN, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd2);
        dvds.add(dvd3);
        Library library = new Library();

        //test
        List<DVD> result = library.putDvds(dvds);

        //assert
        assertEquals(0, result.size());
    }

    @Test
    public void putDvds_with_2_same_dvds() {
        //set
        DVD dvd = new DVD("dvd", 120, 0, Movie.HORROR, false);
        DVD dvd1 = new DVD("dvd1", 30, 0, Movie.ACTION, true);
        ArrayList<DVD> dvds = new ArrayList<>();
        dvds.add(dvd);
        dvds.add(dvd1);
        dvds.add(dvd1);

        Library library = new Library();

        //test
        List<DVD> result = library.putDvds(dvds);
        //assert
        assertEquals(0, result.size());
    }
}