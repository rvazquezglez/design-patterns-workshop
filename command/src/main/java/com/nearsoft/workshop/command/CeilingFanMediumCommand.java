package com.nearsoft.workshop.command;

public class CeilingFanMediumCommand extends CeilingFanAbstractCommand {
    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }
}
