package io.github.stawirej.fluentapi.example.explicit.library;

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
