package com.adapter;

public class GreyDuck implements Duck {

    @Override
    public void crack() {
        System.out.println("crack GreyDuck");
    }

    @Override
    public void fly() {
        System.out.println("fly GreyDuck");
    }
}
