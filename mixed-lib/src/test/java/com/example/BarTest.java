package com.example;

import org.junit.Assert;
import org.junit.Test;

public class BarTest {

  @Test
  public void testBar() {
    Assert.assertEquals("Hello " + Constants.NAME, Bar.hello());
  }

  @Test
  public void testBaz() {
    Assert.assertEquals(20, new Baz().age());
  }
}
