package com.github.stawirej.fluentapi.example.generic.medicalcenter;

public interface With<T, U, V> {

    To<U, V> with(T value);
}
