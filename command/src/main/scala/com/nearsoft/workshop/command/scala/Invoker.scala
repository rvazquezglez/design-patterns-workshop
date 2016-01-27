package com.nearsoft.workshop.command.scala

class Invoker {
  var commands: Vector[() => Unit] = Vector()

  def executeCommand(command: () => Unit) = {
    commands = commands :+ command
    command()
  }

  def replayCommands = {
    commands.foreach(_.apply())
  }
}
