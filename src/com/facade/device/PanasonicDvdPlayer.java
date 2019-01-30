package com.facade.device;

public class PanasonicDvdPlayer implements DvdPlayer{

    public void play(){
        System.out.println("PanasonicDvdPlayer is play");
    }

    public void off(){
        System.out.println("PanasonicDvdPlayer is off");
    }
}
