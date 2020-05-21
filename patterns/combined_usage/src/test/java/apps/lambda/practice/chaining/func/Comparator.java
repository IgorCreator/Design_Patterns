package apps.lambda.practice.chaining.func;

import java.util.Objects;
import java.util.function.Function;

@FunctionalInterface
public interface Comparator<T> {

    int compare (T t1, T t2);

    static <T, U extends Comparable< ? super U>> Comparator<T> comparing(Function<T, U> keyExtractor) {
        Objects.requireNonNull(keyExtractor);
        return (p1, p2) -> {
            U name1 = keyExtractor.apply(p1);
            U name2 = keyExtractor.apply(p2);
            return name1.compareTo(name2);
        };
    }

    default Comparator<T> reversed(){
        return (t1, t2) -> this.compare(t2, t1);
    }
}
