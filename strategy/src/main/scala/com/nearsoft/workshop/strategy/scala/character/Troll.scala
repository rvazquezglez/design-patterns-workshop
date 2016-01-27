package com.nearsoft.workshop.strategy.scala.character

import org.slf4j.LoggerFactory

class Troll extends Character {

  val log = LoggerFactory.getLogger(classOf[King])

  override def fight = {
    log.debug(s"Trololol, I'm ${useWeapon}")
  }
}
