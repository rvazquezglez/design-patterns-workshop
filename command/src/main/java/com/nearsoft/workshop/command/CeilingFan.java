package com.nearsoft.workshop.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CeilingFan {

    // @Slf4j annotation in Lombok or Groovy
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public enum CeilingFanSpeed {OFF, LOW, MEDIUM, HIGH}

    private CeilingFanSpeed speed;

    public CeilingFan() {
        this.speed = CeilingFanSpeed.OFF;
        log.debug("Created CeilingFan");
    }

    public void high() {
        this.speed = CeilingFanSpeed.HIGH;
        log.debug("CeilingFan setted to HIGH");
    }

    public void medium() {
        this.speed = CeilingFanSpeed.MEDIUM;
        log.debug("CeilingFan setted to MEDIUM");
    }

    public void low() {
        this.speed = CeilingFanSpeed.LOW;
        log.debug("CeilingFan setted to LOW");
    }

    public void off() {
        this.speed = CeilingFanSpeed.OFF;
        log.debug("CeilingFan setted to OFF");
    }
}
