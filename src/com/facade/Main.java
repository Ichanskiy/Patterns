package com.facade;

import com.facade.device.*;

public class Main {

    public static void main(String[] args) {
        DvdPlayer player = new PanasonicDvdPlayer();
        Light light = new KinoRoomLight();
        PopcornPopper popcornPopper = new PopcornMachine();

        HomeTheaterFacade theaterFacade = new HomeTheaterFacade(player, light, popcornPopper);
        theaterFacade.watchMovie("Home alone");
        theaterFacade.endMovie();
    }

}
