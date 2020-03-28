package com.github.stawirej.fluentapi.example.library;


import com.github.stawirej.fluentapi.prepositions.simple.ToConsumer;

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

    public ToConsumer<Reader> lend(Book book) {

        return reader -> lend(book, reader);
    }

    private void lend(
            Book book,
            Reader reader) {

        int bookIndex = books.indexOf(book);
        Book foundBook = books.get(bookIndex);
        reader.add(foundBook);
        books.remove(bookIndex);
    }
}