package com.nearsoft.workshop.scala

object DocumentGenerator {
  def makeHtmlString(part: DocumentPart): String = part match {
    case BoldText(text) => s"<b>$text</b>"
    case Hiperlink(text, url) => s"""<a href="$url">$text</b>"""
    case PlainText(text) => text
    case _ => ""
  }

  def makeLatexString(part: DocumentPart): String = part match {
    case BoldText(text) => s"\\textbf{$text}"
    case Hiperlink(text, url) => s"\\href={$url}{$text}"
    case PlainText(text) => text
    case _ => ""
  }
}
