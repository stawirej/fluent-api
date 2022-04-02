package io.github.stawirej.fluentapi.example.generic.library;

import java.util.ArrayList;
import java.util.List;

public final class Library {

    private final List<Book> books = new ArrayList<>();

    public List<Book> books() {

        return books;
    }

    public void add(Book book) {

        books.add(book);
    }

//    public To<Reader> lend(Book book) {
//
//        return new To<Reader>() {
//            @Override
//            public void to(Reader reader) {
//
//                lend(book, reader);
//            }
//        };
//    }

    public To<Reader> lend(Book book) {

        return reader -> lend(book, reader);
    }

    private void lend(
            Book book,
            Reader reader) {

        try {
            int bookIndex = books.indexOf(book);
            Book foundBook = books.get(bookIndex);
            reader.add(foundBook);
            books.remove(bookIndex);
        } catch (Exception exception) {
            throw new CouldNotLendBook();
        }
    }
}
