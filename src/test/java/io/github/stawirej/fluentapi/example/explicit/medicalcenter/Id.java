package io.github.stawirej.fluentapi.example.explicit.medicalcenter;

import java.util.Objects;

public final class Id {

    private final int id;

    private Id(int id) {

        this.id = id;
    }

    public static Id of(int id) {

        return new Id(id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Id id1 = (Id) o;
        return id == id1.id;
    }
}
