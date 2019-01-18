package com.combination;

import static com.combination.QuackCounter.getNumberOfQuacks;

public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        main.simulate(duckFactory);
    }

    private void simulate(AbstractDuckFactory duckFactory) {
        Flock flockOfDucks = new Flock();

        Quackable mallardDuck = duckFactory.createMallardDuck();
        flockOfDucks.add(mallardDuck);
        Quackable duckCall = duckFactory.createDuckCall();
        flockOfDucks.add(duckCall);
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        flockOfDucks.add(redheadDuck);
        Quackable rubberDuck = duckFactory.createRubberDuck();
        flockOfDucks.add(rubberDuck);

        Flock flockOfMallards = new Flock();
        flockOfMallards.add(new MallardDuck());
        flockOfMallards.add(new MallardDuck());
        flockOfMallards.add(new MallardDuck());

        flockOfDucks.add(flockOfMallards);

        Quackable goose = new GooseAdapter(new Goose());
        flockOfDucks.add(goose);

        simulate(flockOfDucks);
        System.out.println("numberOfQuacks = " + getNumberOfQuacks());
        simulate(flockOfMallards);
        System.out.println("numberOfQuacks = " + getNumberOfQuacks());

    }

    private void simulate(Quackable duck) {
        duck.quack();
    }
}
