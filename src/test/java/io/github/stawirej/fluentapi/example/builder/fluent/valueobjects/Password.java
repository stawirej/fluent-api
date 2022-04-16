package io.github.stawirej.fluentapi.example.builder.fluent.valueobjects;

final class Password {

    private final String password;

    public Password(final String password) {
        this.password = password;
    }

    public static Password from(final String password) {
        return new Password(password);
    }
}
