package com.adapter;

public class WildTurkeyAdapter extends WildTurkey implements Duck {

    @Override
    public void crack() {
        super.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            super.fly();
        }
    }
}
