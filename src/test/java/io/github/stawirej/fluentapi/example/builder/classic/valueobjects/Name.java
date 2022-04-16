package io.github.stawirej.fluentapi.example.builder.classic.valueobjects;

final class Name {

    private final String name;

    private Name(String name) {
        this.name = name;
    }

    public static Name from(final String name) {
        return new Name(name);
    }
}
