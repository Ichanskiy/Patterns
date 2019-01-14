package com.state;

public class SoltOutState implements State{

    private GumballMachine gumballMachine;

    public SoltOutState(GumballMachine gumballMachine) {
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
