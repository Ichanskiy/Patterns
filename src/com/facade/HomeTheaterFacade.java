package com.facade;

import com.facade.device.DvdPlayer;
import com.facade.device.Light;
import com.facade.device.PopcornPopper;

public class HomeTheaterFacade {
    private DvdPlayer dvdPlayer;
    private Light light;
    private PopcornPopper popcornPopper;

    public HomeTheaterFacade(DvdPlayer dvdPlayer, Light light, PopcornPopper popcornPopper) {
        this.dvdPlayer = dvdPlayer;
        this.light = light;
        this.popcornPopper = popcornPopper;
    }

    public void watchMovie(String movie){
        System.out.println("Get ready to watch a movie " + movie);
        popcornPopper.on();
        popcornPopper.pop();
        light.off();
        dvdPlayer.play();
    }

    public void endMovie(){
        popcornPopper.off();
        light.on();
        dvdPlayer.off();
    }
}
