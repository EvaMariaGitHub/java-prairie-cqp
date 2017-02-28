package libraryPartTwo;


import libraryPartTwo.model.Book;
import libraryPartTwo.model.CD;
import libraryPartTwo.model.DVD;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Library implements ILibrary {

    private List<Book> books = new ArrayList<>();
    private List<DVD> dvds = new ArrayList<>();
    private List<CD> cds = new ArrayList<>();
    private int hour = 3;

    @Override
    public List<Book> putBooks(List<Book> books) {
        if (isOpen(hour)) {
            this.books.addAll(books);
        }
        return this.books;
    }

    @Override
    public List<CD> putCDs(List<CD> cds) {
        if (isOpen(hour)) {
            this.cds.addAll(cds);
        }
        return this.cds;
    }

    @Override
    public List<DVD> putDvds(List<DVD> dvds) {
        if (isOpen(hour)) {
            int sizeTotal = dvds.size() + this.dvds.size();
            int STORAGE_MAX = 3;
            if (sizeTotal <= STORAGE_MAX && !verifyDoubleFromDvds(dvds)) {
                this.dvds.addAll(dvds);
                if (verifyDoubleOnDvds()) {
                    for (DVD dvd : dvds) {
                        this.dvds.remove(dvd);
                    }
                }
            }
        }
        return this.dvds;
    }

    private boolean verifyDoubleOnDvds() {
        HashSet<DVD> dvdsSet = new HashSet<>(this.dvds);
        return dvdsSet.size() != this.dvds.size();
    }

    private boolean verifyDoubleFromDvds(List<DVD> dvds) {
        boolean hasDouble = false;
        for (DVD dvd : dvds) {
            if (this.dvds.contains(dvd)) {
                hasDouble = true;
            }
        }
        return hasDouble;
    }

    private boolean isOpen(int hour) {
        int CLOSE = 7;
        int OPEN = 1;
        return hour >= OPEN && hour <= CLOSE;
    }

}
