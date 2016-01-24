package com.nearsoft.workshop.scala

import org.scalatest._

class ImmutableProductSpec extends FlatSpec with Matchers {

  "A immutable product" should "have values set by name in construction" in {
    val product = new ImmutableProduct(name = "Tonayan",
      description = "Este producto te dará super poderes",
      price = 10.50,
      sku = "1234ASDFQWERZXCV")

    product.name should be("Tonayan")
    product.description should be("Este producto te dará super poderes")
    product.price should be(10.50)
    product.sku should be("1234ASDFQWERZXCV")
  }
}