package com.nearsoft.workshop.scala

import org.scalatest.{FlatSpec, Matchers}
import org.slf4j.LoggerFactory

import com.nearsoft.workshop.scala.DocumentGenerator._


class DocumentGeneratorTest extends FlatSpec with Matchers {

  val log = LoggerFactory.getLogger(classOf[DocumentGeneratorTest])

  "A list of document parts" should "generate an html page" in {
    val result = List(
      new BoldText("This is a bold text"),
      new Hiperlink("this goes to google", "http://google.com"),
      new PlainText("Plain text")
    ).map(makeHtmlString).mkString("")

    log.info(result)
  }

  "A list of document parts" should "generate a latex page" in {
    val result = List(
      new BoldText("This is a bold text"),
      new Hiperlink("this goes to google", "http://google.com"),
      new PlainText("Plain text")
    ).map(makeLatexString).mkString("")

    log.info(result)
  }
}
