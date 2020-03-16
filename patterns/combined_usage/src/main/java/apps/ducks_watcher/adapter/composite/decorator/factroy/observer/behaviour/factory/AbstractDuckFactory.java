package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.factory;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo.Quackable;

public abstract class AbstractDuckFactory {
 
	public abstract Quackable createMallardDuck();
	public abstract Quackable createRedheadDuck();
	public abstract Quackable createDuckCall();
	public abstract Quackable createRubberDuck();
}
