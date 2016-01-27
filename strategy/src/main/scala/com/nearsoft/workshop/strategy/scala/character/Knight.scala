package com.nearsoft.workshop.strategy.scala.character

import org.slf4j.LoggerFactory


class Knight extends Character {

  val log = LoggerFactory.getLogger(classOf[King])

  override def fight = {
    log.debug(s"But I will always come for ${useWeapon}")
  }
}
