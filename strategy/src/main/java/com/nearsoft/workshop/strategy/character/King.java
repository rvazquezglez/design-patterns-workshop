package com.nearsoft.workshop.strategy.character;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class King extends Character {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void fight() {
        log.debug(String.format("I'M THE KING, and I'm %s", weaponBehaviour.useWeapon()));
    }
}
