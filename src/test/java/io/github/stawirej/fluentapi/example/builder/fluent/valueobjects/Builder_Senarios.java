package io.github.stawirej.fluentapi.example.builder.fluent.valueobjects;

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
        User user = User.with(Name.from("John"))
                        .with(Surname.from("Doe"))
                        .with(Login.from("johndoe"))
                        .with(Password.from("sosecretpassword"))
                        .with(Email.from("john.doe@gmail.com"));

        // Then
        then(user.name()).usingRecursiveComparison().isEqualTo(Name.from("John"));
        then(user.surname()).usingRecursiveComparison().isEqualTo(Surname.from("Doe"));
        then(user.email()).usingRecursiveComparison().isEqualTo(Email.from("john.doe@gmail.com"));
        then(user.login()).usingRecursiveComparison().isEqualTo(Login.from("johndoe"));
        then(user.password()).usingRecursiveComparison().isEqualTo(Password.from("sosecretpassword"));
    }

}
