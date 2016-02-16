package com.nearsoft.workshop.scala

class DocumentPart

case class BoldText(text: String) extends DocumentPart

case class Hiperlink(text: String, url: String) extends DocumentPart

case class PlainText(text: String) extends DocumentPart
