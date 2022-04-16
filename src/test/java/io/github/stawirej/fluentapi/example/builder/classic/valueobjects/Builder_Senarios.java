package io.github.stawirej.fluentapi.example.builder.classic.valueobjects;

import static io.github.stawirej.fluentapi.example.builder.classic.valueobjects.User.user;
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
        User user =
            user()
                .withName(Name.from("John"))
                .withSurname(Surname.from("Doe"))
                .withLogin(Login.from("johndoe"))
                .withPassword(Password.from("sosecretpassword"))
                .withEmail(Email.from("john.doe@gmail.com"))
                .build();

        // Then
        then(user.name()).usingRecursiveComparison().isEqualTo(Name.from("John"));
        then(user.surname()).usingRecursiveComparison().isEqualTo(Surname.from("Doe"));
        then(user.email()).usingRecursiveComparison().isEqualTo(Email.from("john.doe@gmail.com"));
        then(user.login()).usingRecursiveComparison().isEqualTo(Login.from("johndoe"));
        then(user.password()).usingRecursiveComparison().isEqualTo(Password.from("sosecretpassword"));
    }

}
