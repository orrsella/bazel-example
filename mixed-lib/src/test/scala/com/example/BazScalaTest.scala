package com.example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.WordSpec

@RunWith(classOf[JUnitRunner])
class HelloWorldScalaTest extends WordSpec {

  "Baz" should {
    "have the correct age" in {
      val baz = new Baz
      assert(baz.age === 20)
    }
  }
}
