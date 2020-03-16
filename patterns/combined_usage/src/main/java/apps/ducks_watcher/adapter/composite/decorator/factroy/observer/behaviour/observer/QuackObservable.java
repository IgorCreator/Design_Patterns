package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer;

public interface QuackObservable {
	public void registerObserver(Observer observer);
	public void notifyObservers();
}
