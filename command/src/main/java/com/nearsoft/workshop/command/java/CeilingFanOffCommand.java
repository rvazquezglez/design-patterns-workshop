package com.nearsoft.workshop.command.java;

public class CeilingFanOffCommand extends CeilingFanAbstractCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
