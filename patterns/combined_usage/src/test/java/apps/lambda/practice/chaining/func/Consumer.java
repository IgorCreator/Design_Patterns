package apps.lambda.practice.chaining.func;

import java.util.Objects;

@FunctionalInterface
public interface Consumer<S> {

    void accept(S value);

    //DEFAULT because FunctionalInterface allows to have only one method (in this case accept)
    default Consumer<S> andThen(Consumer<S> other){
        Objects.requireNonNull(other);
        return (S s) ->
        {
            this.accept(s);
            other.accept(s);
        };
    }
}
