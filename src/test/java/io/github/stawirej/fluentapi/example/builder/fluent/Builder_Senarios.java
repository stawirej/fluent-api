package io.github.stawirej.fluentapi.example.builder.fluent;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
final class Builder_Senarios {

    @Test
    void fluent_builder() {
        // Given

        // When
        User user = User.with("John")
                        .with("Doe")
                        .with("johndoe")
                        .with("sosecretpassword")
                        .with("john.doe@gmail.com");

        // Then
        then(user.name()).isEqualTo("John");
        then(user.surname()).isEqualTo("Doe");
        then(user.email()).isEqualTo("john.doe@gmail.com");
        then(user.login()).isEqualTo("johndoe");
        then(user.password()).isEqualTo("sosecretpassword");
    }

}
