package com.example

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BarTest extends Specification {

  "Bar" should {
    "have the correct string" in {
      Bar.hello must_== "Hello " + Constants.NAME
      1 must_== 2
    }
  }
}
