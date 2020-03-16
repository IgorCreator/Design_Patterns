package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observable;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observer;

public class RedheadDuck implements Quackable {
	Observable observable;

	public RedheadDuck() {
		observable = new Observable(this);
	}

	public void quack() {
		System.out.println("Quack");
		notifyObservers();
	}

	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}

	public String toString() {
		return "Redhead Duck";
	}
}
