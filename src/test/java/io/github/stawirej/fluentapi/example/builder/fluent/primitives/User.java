package io.github.stawirej.fluentapi.example.builder.fluent.primitives;

import static java.util.Objects.requireNonNull;

import io.github.stawirej.fluentapi.prepositions.simple.WithFunction;

public final class User {

    private final String name;
    private final String surname;
    private final String login;
    private final String password;
    private final String email;

    private User(String name,
                 String surname,
                 String login,
                 String password,
                 String email) {

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

    public static WithFunction<WithFunction<WithFunction<WithFunction<User, String>, String>, String>, String> with(String name) {

        return surname -> login -> password -> email -> new User(name, surname, login, password, email);
    }

    public String name() {
        return name;
    }

    public String surname() {
        return surname;
    }

    public String login() {
        return login;
    }

    public String password() {
        return password;
    }

    public String email() {
        return email;
    }
}