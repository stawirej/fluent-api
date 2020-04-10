package com.github.stawirej.fluentapi.example.scenarios.dsl.library;

import com.github.stawirej.fluentapi.example.dsl.library.Book;
import com.github.stawirej.fluentapi.example.dsl.library.CouldNotLendBook;
import com.github.stawirej.fluentapi.example.dsl.library.Library;
import com.github.stawirej.fluentapi.example.dsl.library.Reader;
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
