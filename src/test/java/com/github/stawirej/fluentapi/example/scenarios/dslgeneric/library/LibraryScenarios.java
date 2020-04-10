package com.github.stawirej.fluentapi.example.scenarios.dslgeneric.library;

import com.github.stawirej.fluentapi.example.dslgeneric.library.Book;
import com.github.stawirej.fluentapi.example.dslgeneric.library.CouldNotLendBook;
import com.github.stawirej.fluentapi.example.dslgeneric.library.Library;
import com.github.stawirej.fluentapi.example.dslgeneric.library.Reader;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;
import static org.assertj.core.api.ThrowableAssert.catchThrowable;

final class LibraryScenarios {

    @Test
    void lendBook() {
        // Given
        Library library = new Library();
        Reader reader = new Reader();
        Book book = new Book();
        library.add(book);

        // When
        // library.lend(book, reader);
        library.lend(book).to(reader);

        // Then
        then(reader.books()).containsExactly(book);
        then(library.books()).doesNotContain(book);
    }

    @Test
    void reportErrorOnLendingNotExistingBook() {
        // Given
        Library library = new Library();
        Reader reader = new Reader();
        Book book = new Book();

        // When
        Throwable cause = catchThrowable(() -> library.lend(book).to(reader));

        // Then
        then(cause).isInstanceOf(CouldNotLendBook.class);
    }
}
