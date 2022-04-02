package io.github.stawirej.fluentapi.example.scenarios.fluentapi.higherorder;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.BDDAssertions.then;

final class HigherOrderFunctionsScenarios {

    @Test
    void filterGoldenDeliciousApples() {
        // Given
        List<Apple> apples = new ArrayList<>();
        apples.add(Apple.of(Apple.Cultivar.GOLDEN_DELICIOUS));
        apples.add(Apple.of(Apple.Cultivar.FUJI));
        apples.add(Apple.of(Apple.Cultivar.GRANNY_SMITH));

        Predicate<? super Apple> isGoldenDelicious = apple -> apple.cultivar().equals(Apple.Cultivar.GOLDEN_DELICIOUS);

        // When
        List<Apple> goldenDelicious = apples
                .stream()
                .filter(isGoldenDelicious)
                .collect(toList());

        // Then
        then(goldenDelicious.size()).isEqualTo(1);
    }
}
