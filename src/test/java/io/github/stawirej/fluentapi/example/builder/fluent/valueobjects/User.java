package io.github.stawirej.fluentapi.example.builder.fluent.valueobjects;

import static java.util.Objects.requireNonNull;

import io.github.stawirej.fluentapi.prepositions.simple.WithFunction;

public final class User {

    private final Name name;
    private final Surname surname;
    private final Login login;
    private final Password password;
    private final Email email;

    private User(Name name,
                 Surname surname,
                 Login login,
                 Password password,
                 Email email) {

        requireNonNull(name, "name cannot be null");
        requireNonNull(surname, "surname cannot be null");
        requireNonNull(login, "login cannot be null");
        requireNonNull(password, "password cannot be null");
        requireNonNull(email, "email cannot be null");

        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public static WithFunction<WithFunction<WithFunction<WithFunction<User, Email>, Password>, Login>, Surname> with(Name name) {

        return surname -> login -> password -> email -> new User(name, surname, login, password, email);
    }

    public Name name() {
        return name;
    }

    public Surname surname() {
        return surname;
    }

    public Login login() {
        return login;
    }

    public Password password() {
        return password;
    }

    public Email email() {
        return email;
    }
}