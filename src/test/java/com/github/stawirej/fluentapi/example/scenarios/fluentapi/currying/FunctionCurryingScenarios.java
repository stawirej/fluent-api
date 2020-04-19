package com.github.stawirej.fluentapi.example.scenarios.fluentapi.currying;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;
import java.util.function.Function;

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
        Function<Integer, Function<Integer, Integer>> add = new Function<Integer, Function<Integer, Integer>>() {

            @Override
            public Function<Integer, Integer> apply(Integer a) {

                return new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer b) {

                        return a + b;
                    }
                };
            }
        };

        // When
        Integer sum = add.apply(1).apply(2);

        // Then
        then(sum).isEqualTo(3);
    }

    @Test
    void curryingAsLambdas() {
        // Given
        Function<Integer, Function<Integer, Integer>> add = a -> b -> a + b;

        // When
        Integer sum = add.apply(1).apply(2);

        // Then
        then(sum).isEqualTo(3);
    }
}
