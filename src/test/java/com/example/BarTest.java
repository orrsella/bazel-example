package com.example;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {

  @Test
  public void testBar() {
    Assert.assertEquals("Hello " + Constants.NAME, Bar.hello());
  }
}
