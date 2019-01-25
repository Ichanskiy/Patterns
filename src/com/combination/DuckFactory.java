package com.combination;

public class DuckFactory extends AbstractDuckFactory {
    @Override
    public Quackable createMallardDuck() {
        return new MallardDuck();
    }

    @Override
    public Quackable createRedheadDuck() {
        return RedheadDuck::new;
    }

    @Override
    public Quackable createDuckCall() {
        return DuckCall::new;
    }

    @Override
    public Quackable createRubberDuck() {
        return RubberDuck::new;
    }
}
