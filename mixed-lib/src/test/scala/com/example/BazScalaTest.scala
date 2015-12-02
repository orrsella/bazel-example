package com.example

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.WordSpec

@RunWith(classOf[JUnitRunner])
class BazScalaTest extends WordSpec {

  "Baz" should {
    "have the correct age" in {
      assert(new Baz().age === 20)
      // assert(1 === 2)
    }
  }
}
