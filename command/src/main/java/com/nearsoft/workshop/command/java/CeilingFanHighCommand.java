package com.nearsoft.workshop.command.java;

public class CeilingFanHighCommand extends CeilingFanAbstractCommand {

    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }
}
