package com.nearsoft.workshop.command;

public class CeilingFanOffCommand extends CeilingFanAbstractCommand {

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
