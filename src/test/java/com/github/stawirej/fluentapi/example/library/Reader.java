package com.github.stawirej.fluentapi.example.library;

import java.util.ArrayList;
import java.util.List;

public final class Reader {

    private final List<Book> books = new ArrayList<>();

    public List<Book> books() {

        return books;
    }

    public void add(Book book) {

        books.add(book);
    }
}
