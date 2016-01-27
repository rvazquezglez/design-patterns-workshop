package com.nearsoft.workshop.command.java;

public class CeilingFanLowCommand extends CeilingFanAbstractCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.low();
    }
}
