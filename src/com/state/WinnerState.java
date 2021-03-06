package com.state;

public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
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
        System.out.println("YOU ARE A WINNER");
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if (gumballMachine.getCount() > 0) {
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            } else {
                System.out.println("out of gumballs");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
