package com.state;

public class GumballMachine {

    private State noQuarterState; // нет монетки
    private State hasQuarterState;  // есть монетка
    private State soldOutState; // шарики розпрроданы
    private State soldState;     // продано

    private State state = soldOutState;
    private int count = 0;

    public GumballMachine(int numberGumballs) {
        this.noQuarterState = new NoQuarterState(this);
        this.hasQuarterState = new HasQuarterState(this);
        this.soldOutState = new SoltOutState(this);
        this.soldState = new SoltState(this);
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
//    public void insertQuater() {
//        if (state == HAS_QUARTER) {
//            System.out.println("You can`t insert another quarter");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("You inserted a quarter");
//        } else if (state == SOLD_OUT) {
//            System.out.println("You can`t insert a quarter, the machine is sold out");
//        } else if (state == SOLD) {
//            System.out.println("Please wait, we`re already giving your gumball");
//        }
//    }
}
