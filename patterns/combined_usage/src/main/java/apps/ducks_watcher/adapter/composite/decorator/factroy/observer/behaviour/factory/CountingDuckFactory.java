package apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.factory;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.QuackCounter;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo.*;

public class CountingDuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new QuackCounter(new MallardDuck());
	}
  
	public Quackable createRedheadDuck() {
		return new QuackCounter(new RedheadDuck());
	}
  
	public Quackable createDuckCall() {
		return new QuackCounter(new DuckCall());
	}
   
	public Quackable createRubberDuck() {
		return new QuackCounter(new RubberDuck());
	}
}
