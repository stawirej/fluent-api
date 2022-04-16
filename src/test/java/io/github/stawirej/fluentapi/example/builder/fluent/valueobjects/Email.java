package io.github.stawirej.fluentapi.example.builder.fluent.valueobjects;

final class Email {

    private final String email;

    private Email(String email) {
        this.email = email;
    }

    public static Email from(final String email) {

        return new Email(email);
    }
}
