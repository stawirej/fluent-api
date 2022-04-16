package io.github.stawirej.fluentapi.example.builder.classic.valueobjects;

final class Surname {

    private final String surname;

    private Surname(String surname) {
        this.surname = surname;
    }

    public static Surname from(final String surname) {
        return new Surname(surname);
    }
}
