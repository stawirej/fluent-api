package io.github.stawirej.fluentapi.example.scenarios.fluentapi.library;

import io.github.stawirej.fluentapi.example.fluentapi.library.Book;
import io.github.stawirej.fluentapi.example.fluentapi.library.CouldNotLendBook;
import io.github.stawirej.fluentapi.example.fluentapi.library.Library;
import io.github.stawirej.fluentapi.example.fluentapi.library.Reader;
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
