package com.adapter;

public class Main {

    public static void main(String[] args) {
        Turkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
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
