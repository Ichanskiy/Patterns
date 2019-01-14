package com.state;

public class SoltState implements State {

    private GumballMachine gumballMachine;

    public SoltState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {

    }

    @Override
    public void ejectQuarter() {

    }

    @Override
    public void dispense() {

    }
}
