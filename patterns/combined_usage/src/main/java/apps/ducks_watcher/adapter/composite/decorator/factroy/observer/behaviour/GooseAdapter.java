package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observable;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observer;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo.Goose;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo.Quackable;

// Interpretation pattern: adapter
public class GooseAdapter implements Quackable {
    Goose goose;
    Observable observable;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
        observable = new Observable(this);
    }

    public void quack() {
        goose.honk();
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers();
    }

    public String toString() {
        return "Goose pretending to be a Duck";
    }
}
