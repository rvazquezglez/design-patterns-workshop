package com.nearsoft.workshop.command.java;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// Client
public class InvokerTest {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private Invoker invoker;
    private CeilingFan ceilingFan;

    @Before
    public void setUp() throws Exception {
        invoker = new Invoker();
        ceilingFan = new CeilingFan();
    }

    @Test
    public void testExecuteCommands() throws Exception {
        invoker.executeCommand(new CeilingFanHighCommand(ceilingFan));
        invoker.executeCommand(new CeilingFanLowCommand(ceilingFan));
        invoker.executeCommand(new CeilingFanOffCommand(ceilingFan));
    }

    @Test
    public void testExecuteReplay() throws Exception {
        invoker.executeCommand(new CeilingFanMediumCommand(ceilingFan));
        invoker.executeCommand(new CeilingFanOffCommand(ceilingFan));

        log.debug("--- Replaying");

        invoker.replay();
    }
}