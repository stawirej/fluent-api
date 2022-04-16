package io.github.stawirej.fluentapi.example.builder.classic.valueobjects;

final class Login {

    private final String login;

    private Login(final String login) {
        this.login = login;
    }

    public static Login from(final String login) {
        return new Login(login);
    }
}
