package com.github.stawirej.fluentapi.example.scenarios;

import com.github.stawirej.fluentapi.example.library.Book;
import com.github.stawirej.fluentapi.example.library.Library;
import com.github.stawirej.fluentapi.example.library.Reader;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.BDDAssertions.then;

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

}
