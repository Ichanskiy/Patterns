package com.facade.device;

public class KinoRoomLight implements Light {

    @Override
    public void on() {
        System.out.println("Light is on");
    }

    @Override
    public void off() {
        System.out.println("Light is off");
    }
}
