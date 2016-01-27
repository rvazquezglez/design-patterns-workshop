package com.nearsoft.workshop.strategy.scala

import com.nearsoft.workshop.strategy.scala.character._
import org.scalatest.{FlatSpec, Matchers}
import org.slf4j.LoggerFactory

class CharacterSpec extends FlatSpec with Matchers {

  val log = LoggerFactory.getLogger(classOf[CharacterSpec])

  "A character" should "fight with the weapon assigned to it" in {
    val king = new King
    king.setWeaponBehaviour(() => "cutting with a knife.")

    val queen = new Queen
    queen.setWeaponBehaviour(() => "shooting an arrow with a bow.")

    val troll: Character = new Troll
    troll.setWeaponBehaviour(() => "chopping with an axe.")

    val secondTroll: Character = new Troll
    secondTroll.setWeaponBehaviour(() => "shooting with a shotgun.")

    val knight: Character = new Knight
    knight.setWeaponBehaviour(() => "cutting with katana.")

    val secondKnight: Character = new Knight
    secondKnight.setWeaponBehaviour(() => "writing with my pencil.")

    val characters = List(king, queen, troll, secondTroll, knight, secondKnight)

    characters.foreach(_.fight)

  }
}
