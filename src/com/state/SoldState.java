package com.state;

public class SoldState implements State {

    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("incorrect");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("incorrect");
    }

    @Override
    public void turnCrank() {
        System.out.println("incorrect");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            System.out.println("out of gumballs");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }
}
