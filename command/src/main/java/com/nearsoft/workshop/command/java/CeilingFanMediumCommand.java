package com.nearsoft.workshop.command.java;

public class CeilingFanMediumCommand extends CeilingFanAbstractCommand {
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }
}
