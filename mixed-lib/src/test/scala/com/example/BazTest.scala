package com.example

import org.junit.runner.RunWith
import org.specs2.mutable.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class BazTest extends Specification {

  "Baz" should {
    "have the correct age" in {
      new Baz.age must_== 20
    }
  }
}
