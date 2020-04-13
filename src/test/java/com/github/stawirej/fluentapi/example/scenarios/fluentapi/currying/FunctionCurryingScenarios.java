package com.github.stawirej.fluentapi.example.scenarios.fluentapi.currying;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.assertj.core.api.BDDAssertions.then;

final class FunctionCurryingScenarios {

    @Test
    void multiparameterFunction() {
        // Given
        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        // When
        Integer sum = add.apply(1, 2);

        // Then
        then(sum).isEqualTo(3);
    }

    @Test
    void currying() {
        // Given

        // When

        // Then
    }
}
