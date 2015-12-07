package com.example;

import org.junit.Assert;
import org.junit.Test;

public class BazTest {

  @Test
  public void testBaz() {
    Assert.assertEquals(20, new Baz().age());
  }
}
