package io.github.stawirej.fluentapi.example.generic.medicalcenter;

public interface To<T, R> {

    At<R> to(T value);
}
