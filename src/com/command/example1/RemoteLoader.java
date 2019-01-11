package com.command.example1;

import com.command.example1.commandsImpl.LightOffCommand;
import com.command.example1.commandsImpl.LightOnCommand;
import com.command.example1.commandsImpl.StereoOffCommand;
import com.command.example1.commandsImpl.StereoOnWithSDCommand;
import com.command.example1.wigets.Light;
import com.command.example1.wigets.Stereo;

public class RemoteLoader {
    public static void main(String[] args) {
        RemoteControl control = new RemoteControl();

        Light livingRoomLight = new Light();
        Light kitchenRoomLight = new Light();
        Stereo stereo = new Stereo();

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);
        Command kitchenRoomLightOn = new LightOnCommand(kitchenRoomLight);
        Command kitchenRoomLightOff = new LightOffCommand(kitchenRoomLight);
        Command stereoOn = new StereoOnWithSDCommand(stereo);
        Command stereoOff = new StereoOffCommand(stereo);

        control.setOnCommand(0, livingRoomLightOn, livingRoomLightOff);
        control.setOnCommand(1, kitchenRoomLightOn, kitchenRoomLightOff);
        control.setOnCommand(2, stereoOn, stereoOff);

        control.onButtonWasPushed(1);
        control.offButtonWasPushed(1);
        control.onButtonWasPushed(2);
        control.offButtonWasPushed(2);
        control.undoButtonWasPushed();
    }
}
