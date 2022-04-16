package io.github.stawirej.fluentapi.example.builder.classic.primitives;

import static io.github.stawirej.fluentapi.example.builder.classic.primitives.User.user;
import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
final class Builder_Senarios {

    @Test
    void old_builder() {
        // Given

        // When
        User user = user().withName("John")
                          .withSurname("Doe")
                          .withEmail("john.doe@gmail.com")
                          .withLogin("johndoe")
                          .withPassword("sosecretpassword")
                          .build();

        // Then
        then(user.name()).isEqualTo("John");
        then(user.surname()).isEqualTo("Doe");
        then(user.email()).isEqualTo("john.doe@gmail.com");
        then(user.login()).isEqualTo("johndoe");
        then(user.password()).isEqualTo("sosecretpassword");
    }

}
