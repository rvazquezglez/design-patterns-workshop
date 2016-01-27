package com.nearsoft.workshop.command.scala

import org.scalatest._
import org.slf4j.LoggerFactory

class InvokerSpec extends FlatSpec with Matchers {

  val log = LoggerFactory.getLogger(classOf[InvokerSpec])

  val invoker = new Invoker
  val ceilingFan = new CeilingFan

  "A invoker" should "invoke the commands passed to it" in {
    invoker.executeCommand(()=> ceilingFan.low)
    invoker.executeCommand(()=> ceilingFan.off)
  }

  it should "be able to replay the story" in {
    invoker.executeCommand(()=> ceilingFan.medium)
    invoker.executeCommand(()=> ceilingFan.off)
    log.debug("--- Replaying")
    invoker.replayCommands
  }
}

