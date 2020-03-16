package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observable;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observer;

public class DuckCall implements Quackable {
	Observable observable;

	public DuckCall() {
		observable = new Observable(this);
	}
 
	public void quack() {
		System.out.println("Kwak");
		notifyObservers();
	}
 
	public void registerObserver(Observer observer) {
		observable.registerObserver(observer);
	}

	public void notifyObservers() {
		observable.notifyObservers();
	}
 
	public String toString() {
		return "Duck Call";
	}
}
