package io.github.stawirej.fluentapi.example.builder;

import static io.github.stawirej.fluentapi.example.builder.User.user;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
final class Builder_Senarios {

    @Test
    void old_builder() {
        // Given

        // When
        User user =
            user()
                .withName("John")
                .withSurname("Doe")
                .withEmail("john.doe@gmail.com")
                .withLogin("johndoe")
                .withPassword("sosecretpassword")
                .build();

        // Then
    }

}
