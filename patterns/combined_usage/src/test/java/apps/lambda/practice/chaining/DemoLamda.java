package apps.lambda.practice.chaining;

import apps.lambda.practice.chaining.func.Consumer;
import apps.lambda.practice.chaining.func.Function;
import apps.lambda.practice.chaining.func.Predicate;
import apps.lambda.practice.chaining.model.Meteo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

public class DemoLamda {

    @Test
    public void testWithConsumer() {
        Consumer<String> c1 = s -> System.out.println("c1=" + s);
        Consumer<String> c2 = s -> System.out.println("c2=" + s);

        c1.accept("hello");
        c2.accept("hello");
    }

    @Test
    public void testWithCombinedConsumerIncorrect() {
        Consumer<String> c1 = s -> System.out.println("c1=" + s);
        Consumer<String> c2 = s -> System.out.println("c2=" + s);

        Consumer<String> c3 = s -> {
            c1.accept(s);
            c2.accept(s);
        };

        c3.accept("Hello");
    }

    @Test
    public void testWithCombinedConsumerCorrect() {
        Consumer<String> c1 = s -> System.out.println("c1=" + s);
        Consumer<String> c2 = s -> System.out.println("c2=" + s);

        Consumer<String> c3 = c1.andThen(c2);
        c3.accept("Hello");
    }

    @Test
    public void testWithCombinedConsumerWithFail() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Consumer<String> c1 = s -> System.out.println("c1=" + s);
            Consumer<String> c2 = s -> System.out.println("c2=" + s);

            Consumer<String> c3 = c1.andThen(null);
            c3.accept("Hello");
        });
    }

    @Test
    public void testWithPredicate() {
        Predicate<String> p1 = Objects::nonNull;
        Predicate<String> p2 = s -> !s.isEmpty();

        Predicate<String> p3 = p1.and(p2);

        assertFalse(p3.test(null));
        assertFalse(p3.test(""));
        assertTrue(p3.test("Hello"));
    }

    @Test
    public void testWithNegatePredicate() {
        Predicate<String> p1 = Objects::nonNull;
        Predicate<String> p2 = String::isEmpty;

        Predicate<String> p3 = p1.and(p2.negate());

        assertFalse(p3.test(null));
        assertFalse(p3.test(""));
        assertTrue(p3.test("Hello"));
    }

    @Test
    public void testWithFunction() {
        Meteo meteo1 = new Meteo(20);
        Meteo meteo2 = new Meteo(40);

        Function<Meteo, Integer> readCelsius = Meteo::getTemp;
        Function<Integer, Double> celsiusToFahr = t -> t * 9d/5d + 32d;

        Function<Meteo, Double> readFarh = readCelsius.andThen(celsiusToFahr);

        assertEquals(68.0, readFarh.apply(meteo1));
        assertEquals(104.0, readFarh.apply(meteo2));
    }

    @Test
    public void testWithComposingFunction() {
        Meteo meteo1 = new Meteo(10);
        Meteo meteo2 = new Meteo(36);

        Function<Meteo, Integer> readCelsius = Meteo::getTemp;
        Function<Integer, Double> celsiusToFahr = t -> t * 9d/5d + 32d;

        Function<Meteo, Double> readFarh = celsiusToFahr.composing(readCelsius);

        assertEquals(50.0, readFarh.apply(meteo1));
        assertEquals(96.8, readFarh.apply(meteo2));
    }

    @Test
    public void testWithIdentityFunction() {
        Function<String, String> str = Function.identity();
    }
}
