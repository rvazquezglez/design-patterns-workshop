package com.nearsoft.workshop.strategy.scala.character

import org.slf4j.LoggerFactory

class King extends Character {

  val log = LoggerFactory.getLogger(classOf[King])

  override def fight = {
    log.debug(s"I'M THE KING, and I'm ${useWeapon}")
  }
}
