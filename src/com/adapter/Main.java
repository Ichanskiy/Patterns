package com.adapter;

public class Main {

    public static void main(String[] args) {
        WildTurkeyAdapter turkeyAdapter = new WildTurkeyAdapter();
        turkeyAdapter.crack();
        turkeyAdapter.fly();
        testDuck(turkeyAdapter);

        Duck duck = new GreyDuck();
        DuckAdapter duckAdapter = new DuckAdapter(duck);
        duckAdapter.gobble();
        duckAdapter.fly();
        testTurkey(duckAdapter);
    }

    private static void testDuck(Duck duck){
        duck.crack();
        duck.fly();
    }

    private static void testTurkey(Turkey turkey){
        turkey.gobble();
        turkey.fly();
    }
}
