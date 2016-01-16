package com.nearsoft.workshop.command;

public abstract class CeilingFanAbstractCommand implements Command {
    protected CeilingFan ceilingFan;

    public CeilingFanAbstractCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
}
