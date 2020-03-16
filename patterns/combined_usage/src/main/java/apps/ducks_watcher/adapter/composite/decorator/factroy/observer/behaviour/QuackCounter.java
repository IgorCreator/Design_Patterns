package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observer;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo.Quackable;

// Interpretation pattern: decorator
public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getNumbOfQuacks() {
        return numberOfQuacks;
    }

    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    public void notifyObservers() {
        duck.notifyObservers();
    }

    public String toString() {
        return duck.toString();
    }
}
