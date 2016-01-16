package com.nearsoft.workshop.command;

public class CeilingFanLowCommand extends CeilingFanAbstractCommand {

    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.low();
    }
}
