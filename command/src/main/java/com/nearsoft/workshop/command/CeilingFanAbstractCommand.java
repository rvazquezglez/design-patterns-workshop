package com.nearsoft.workshop.command;

public abstract class CeilingFanAbstractCommand implements Command {
    protected CeilingFan ceilingFan;
    protected int previousSpeed;

    public CeilingFanAbstractCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        previousSpeed = ceilingFan.getSpeed();
    }

    @Override
    public final void undo() {
        switch (previousSpeed) {
            case CeilingFan.HIGH:
                ceilingFan.high();
                break;
            case CeilingFan.MEDIUM:
                ceilingFan.medium();
                break;
            case CeilingFan.LOW:
                ceilingFan.low();
                break;
            case CeilingFan.OFF:
            default:
                ceilingFan.off();
                break;
        }
    }
}
