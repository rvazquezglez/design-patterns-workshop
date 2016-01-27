package com.nearsoft.workshop.strategy.java;

import com.nearsoft.workshop.strategy.character.Character;
import com.nearsoft.workshop.strategy.character.*;
import com.nearsoft.workshop.strategy.weapon.AxeBehaviour;
import com.nearsoft.workshop.strategy.weapon.BowAndArrowBehaviour;
import com.nearsoft.workshop.strategy.weapon.KnifeBehaviour;
import com.nearsoft.workshop.strategy.weapon.SwordBehaviour;
import org.junit.Test;

import java.util.Arrays;

public class CharacterTest {

    @Test
    public void testCharactersWithWeapons() throws Exception {
        Character king = new King();
        king.setWeaponBehaviour(new KnifeBehaviour());

        Character queen = new Queen();
        queen.setWeaponBehaviour(new BowAndArrowBehaviour());

        Character knight = new Knight();
        knight.setWeaponBehaviour(new SwordBehaviour());

        Character troll = new Troll();
        troll.setWeaponBehaviour(new AxeBehaviour());

        Character secondTroll = new Troll();
        secondTroll.setWeaponBehaviour(new SwordBehaviour());

        for (Character character :
                Arrays.asList(king, queen, knight, troll, secondTroll)) {
            character.fight();
        }

    }

}

