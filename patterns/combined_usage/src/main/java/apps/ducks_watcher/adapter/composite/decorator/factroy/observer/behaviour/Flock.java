package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Observer;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo.Quackable;

import java.util.ArrayList;
import java.util.Iterator;

// Interpretation pattern: composite and iterator
public class Flock implements Quackable {
	ArrayList<Quackable> quackers = new ArrayList<>();
 
	public void add(Quackable quacker) {
		quackers.add(quacker);
	}
 
	public void quack() {
		Iterator<Quackable> iterator = quackers.iterator();
		while (iterator.hasNext()) {
			Quackable quacker = iterator.next();
			quacker.quack();
		}
	}
 
	public String toString() {
		return "Flock of Quackers";
	}

	@Override
	public void registerObserver(Observer observer) {

	}

	@Override
	public void notifyObservers() {

	}
}
