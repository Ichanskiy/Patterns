package com.state;

public class GumballMachine {

    private State noQuarterState; // нет монетки
    private State hasQuarterState;  // есть монетка
    private State soldOutState; // шарики розпрроданы
    private State soldState;     // продано
    private State winnerState;     // продано

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoldOutState(this);
        this.soldState = new SoldState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }

    //    public GumballMachine(int count) {
//        this.count = count;
//        if (count > 0) {
//            state = NO_QUARTER;
//        }
//    }
//
    public void insertQuarter() {
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnCrank();
        state.dispense();
    }

    public void setState(State state) {
        this.state = state;
    }

    void releaseBall(){
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0){
            --count;
        }
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
