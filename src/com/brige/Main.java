package com.brige;

import com.brige.devices.Device;
import com.brige.devices.Radio;
import com.brige.devices.Tv;
import com.brige.remotes.AdvancedRemote;
import com.brige.remotes.BasicRemote;
import com.brige.remotes.Remote;

public class Main {

    public static void main(String[] args) {
        Device tv = new Tv();
        AdvancedRemote tvAdvancedRemote = new AdvancedRemote(tv);
        tvAdvancedRemote.power();
        tvAdvancedRemote.mute();
        tvAdvancedRemote.channelUp();
        tvAdvancedRemote.volumeDown();
        tv.printStatus();

        Device radio = new Radio();
        Remote radioRemote = new BasicRemote(radio);
        radioRemote.power();
        radioRemote.channelUp();
        radioRemote.power();
        radio.printStatus();
    }


}
