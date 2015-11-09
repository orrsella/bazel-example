package com.example

object Main {
  def main(args: Array[String]): Unit = {
    println("###################")
    println("# Hello from Main #")
    println("###################")
    println()
    println("Bar.hello = " + Bar.hello)
    println("Baz.age = " + new Baz().age)
    println()
  }
}
