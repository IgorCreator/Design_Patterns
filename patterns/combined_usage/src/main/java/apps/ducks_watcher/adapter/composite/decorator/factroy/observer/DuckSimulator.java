package apps.ducks_watcher.adapter.composite.decorator.factroy.observer;

import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.Flock;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.GooseAdapter;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.QuackCounter;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.factory.AbstractDuckFactory;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.factory.CountingDuckFactory;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.behaviour.observer.Quackologist;
import apps.ducks_watcher.adapter.composite.decorator.factroy.observer.pojo.*;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate_v1_adapter();
		simulator.simulate_v2_decorator();
		simulator.simulate_v3_factory();
		simulator.simulate_v4_composite();
		simulator.simulate_v5_observer();
	}

	void simulate_v1_adapter() {
		Quackable mallardDuck = new MallardDuck();
		Quackable redheadDuck = new RedheadDuck();
		Quackable duckCall = new DuckCall();
		Quackable rubberDuck = new RubberDuck();
		Quackable goose = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Goose Adapter");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);
	}

	void simulate_v2_decorator() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable goose = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Adapter and Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);

		System.out.println("The ducks quacked " +
				QuackCounter.getNumbOfQuacks() + " times");
	}

	private void simulate_v3_factory() {
		AbstractDuckFactory countDuck = new CountingDuckFactory();
		factory_call_simulation(countDuck);
	}

	void factory_call_simulation(AbstractDuckFactory duckFactory) {
		Quackable mallardDuck = duckFactory.createMallardDuck();
		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable goose = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Adapter, Decorator and Factory");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(goose);

		System.out.println("The ducks quacked " +
				QuackCounter.getNumbOfQuacks() + " times");
	}

	private void simulate_v4_composite() {
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Adapter, Decorator, Factory, Iterator and Composite(Flocks)");

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: Whole Flock Simulation");
		simulate(flockOfDucks);

		System.out.println("\nDuck Simulator: Mallard Flock Simulation");
		simulate(flockOfMallards);

		System.out.println("\nThe ducks quacked " +
				QuackCounter.getNumbOfQuacks() +
				" times");
	}

	private void simulate_v5_observer() {
		AbstractDuckFactory duckFactory = new CountingDuckFactory();

		Quackable redheadDuck = duckFactory.createRedheadDuck();
		Quackable duckCall = duckFactory.createDuckCall();
		Quackable rubberDuck = duckFactory.createRubberDuck();
		Quackable gooseDuck = new GooseAdapter(new Goose());

		Flock flockOfDucks = new Flock();

		flockOfDucks.add(redheadDuck);
		flockOfDucks.add(duckCall);
		flockOfDucks.add(rubberDuck);
		flockOfDucks.add(gooseDuck);

		Flock flockOfMallards = new Flock();

		Quackable mallardOne = duckFactory.createMallardDuck();
		Quackable mallardTwo = duckFactory.createMallardDuck();
		Quackable mallardThree = duckFactory.createMallardDuck();
		Quackable mallardFour = duckFactory.createMallardDuck();

		flockOfMallards.add(mallardOne);
		flockOfMallards.add(mallardTwo);
		flockOfMallards.add(mallardThree);
		flockOfMallards.add(mallardFour);

		flockOfDucks.add(flockOfMallards);

		System.out.println("\nDuck Simulator: With Adapter, Decorator, Factory, Iterator, Composite(Flocks) and Observer");

		Quackologist quackologist = new Quackologist();
		flockOfDucks.registerObserver(quackologist);

		simulate(flockOfDucks);

		System.out.println("\nThe ducks quacked " + QuackCounter.getNumbOfQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
