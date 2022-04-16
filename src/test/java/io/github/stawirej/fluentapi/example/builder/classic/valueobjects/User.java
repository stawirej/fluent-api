package io.github.stawirej.fluentapi.example.builder.classic.valueobjects;

import static java.util.Objects.requireNonNull;

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

        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public static UserBuilder user() {
        return new UserBuilder();
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

    public static class UserBuilder {

        private Name name;
        private Surname surname;
        private Login login;
        private Password password;
        private Email email;

        private UserBuilder() {
        }

        public UserBuilder withName(Name name) {
            this.name = name;
            return this;
        }

        public UserBuilder withSurname(Surname surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder withLogin(Login login) {
            this.login = login;
            return this;
        }

        public UserBuilder withPassword(Password password) {
            this.password = password;
            return this;
        }

        public UserBuilder withEmail(Email email) {
            this.email = email;
            return this;
        }

        public User build() {

            requireNonNull(name, "name cannot be null");
            requireNonNull(surname, "surname cannot be null");
            requireNonNull(login, "login cannot be null");
            requireNonNull(password, "password cannot be null");
            requireNonNull(email, "email cannot be null");

            return new User(name, surname, login, password,
                            email);
        }
    }
}