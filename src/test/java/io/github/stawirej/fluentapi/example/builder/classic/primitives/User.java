package io.github.stawirej.fluentapi.example.builder.classic.primitives;

import static java.util.Objects.requireNonNull;

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

        this.name = name;
        this.surname = surname;
        this.login = login;
        this.password = password;
        this.email = email;
    }

    public static UserBuilder user() {
        return new UserBuilder();
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

    public static class UserBuilder {

        private String name;
        private String surname;
        private String login;
        private String password;
        private String email;

        private UserBuilder() {
        }

        public UserBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public UserBuilder withLogin(String login) {
            this.login = login;
            return this;
        }

        public UserBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public User build() {

            requireNonNull(name, "name cannot be null");
            requireNonNull(surname, "surname cannot be null");
            requireNonNull(login, "login cannot be null");
            requireNonNull(password, "password cannot be null");
            requireNonNull(email, "email cannot be null");

            return new User(name, surname, login, password, email);
        }
    }
}