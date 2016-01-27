package com.nearsoft.workshop.strategy.character;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Knight extends Character {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Override
    public void fight() {
        log.debug(String.format("My task is set before me, \n" +
                "My mission clear and true \n" +
                "There’ll be black knights and dragons, \n" +
                "But I will always come for %s", weaponBehaviour.useWeapon()));
    }
}
