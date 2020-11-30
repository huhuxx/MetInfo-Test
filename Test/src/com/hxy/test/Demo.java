package com.hxy.test;



import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

public class Demo {
  @Test
  public void f() {
	  System.out.println("1");
	  assertEquals("1", "1");
  }
}
