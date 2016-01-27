package com.nearsoft.workshop.command.scala

import org.slf4j.LoggerFactory

class CeilingFan {
  val log = LoggerFactory.getLogger(classOf[CeilingFan])

  object CeilingFanSpeed extends Enumeration {
    type CeilingFanSpeed = Value
    val OFF, LOW, MEDIUM, HIGH = Value
  }

  import CeilingFanSpeed._

  var speed = OFF
  log.debug("Created CeilingFan")

  def high = {
    speed = HIGH
    log.debug("CeilingFan setted to HIGH")
  }

  def medium = {
    speed = MEDIUM
    log.debug("CeilingFan setted to MEDIUM")
  }

  def low = {
    speed = LOW
    log.debug("CeilingFan setted to LOW")
  }

  def off = {
    speed = OFF
    log.debug("CeilingFan setted to OFF")
  }


}
