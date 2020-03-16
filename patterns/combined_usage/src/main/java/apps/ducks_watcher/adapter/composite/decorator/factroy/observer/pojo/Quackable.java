package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.QuackObservable;

public interface Quackable extends QuackObservable {
	public void quack();
}
