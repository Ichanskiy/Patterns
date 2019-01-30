package com.facade.device;

public class PopcornMachine implements PopcornPopper {

    @Override
    public void on() {
        System.out.println("PopcornMachine is on");
    }

    @Override
    public void pop() {
        System.out.println("PopcornMachine create popcorn");
    }

    @Override
    public void off() {
        System.out.println("PopcornMachine is off");
    }
}
