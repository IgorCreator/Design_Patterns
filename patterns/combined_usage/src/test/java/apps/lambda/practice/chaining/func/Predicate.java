package apps.lambda.practice.chaining.func;

import java.util.Objects;

@FunctionalInterface
public interface Predicate<S> {

    boolean test(S s);

    //DEFAULT because FunctionalInterface allows to have only one method (in this case accept)
    default Predicate<S> and(Predicate<S> other){
        Objects.requireNonNull(other);
        return (S s) -> this.test(s) && other.test(s);
    }

    default Predicate<S> negate(){
        return (S s) -> !this.test(s);
    };
}
