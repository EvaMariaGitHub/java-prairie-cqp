package libraryPartTwo;


import libraryPartTwo.model.Book;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WorkerTest {

    @Test
    public void putBook_offline() {
        //set
        Worker worker = new Worker("name", 3);
        //test
        List<Book> result = worker.storeBook();
        //assert
        assertEquals(3, result.size());
    }

    @Test
    public void putBook_online() {
        //set
        Worker worker = new Worker("name", 10);
        //test
        List<Book> result = worker.storeBook();
        //assert
        assertEquals(3, result.size());
        Book book = result.get(0);
        assertEquals(1, book.getShippingDay());
    }
}