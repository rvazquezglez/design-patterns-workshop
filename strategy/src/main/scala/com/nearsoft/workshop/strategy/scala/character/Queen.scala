package com.nearsoft.workshop.strategy.scala.character

import org.slf4j.LoggerFactory

class Queen extends Character {

  val log = LoggerFactory.getLogger(classOf[King])

  override def fight = {
    log.debug(s"Mama! just killed a man, and I'm ${useWeapon}")
  }
}
