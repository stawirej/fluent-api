package io.github.stawirej.fluentapi.example.scenarios.fluentapi.higherorder;

final class Apple {

    private final Cultivar cultivar;

    private Apple(Cultivar cultivar) {

        this.cultivar = cultivar;
    }

    public static Apple of(Cultivar cultivar) {

        return new Apple(cultivar);
    }

    public Cultivar cultivar() {

        return cultivar;
    }

    @Override
    public String toString() {

        return "Apple{" +
                "cultivar=" + cultivar +
                '}';
    }

    public enum Cultivar {
        GOLDEN_DELICIOUS,
        HONEYCRISP,
        GRANNY_SMITH,
        FUJI
    }
}
