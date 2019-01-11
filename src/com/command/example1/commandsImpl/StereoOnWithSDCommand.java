package com.command.example1.commandsImpl;

import com.command.example1.Command;
import com.command.example1.wigets.Stereo;

public class StereoOnWithSDCommand implements Command {
    private Stereo stereo;

    public StereoOnWithSDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setSd();
        stereo.setVolume();
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
