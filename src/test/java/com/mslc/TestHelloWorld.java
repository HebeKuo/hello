package com.mslc;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TestHelloWorld {

	private HelloWorld h;

	   @Before
	   public void setUp() throws Exception
	   {
	      h = new HelloWorld();
	   }

	   @Test
	   public void testHelloEmpty() {
		String name = "", msg = "Hello!";
		h.setName(name);
		assertEquals(h.getName(),name);
		assertEquals(h.getMessage(),msg);
		System.out.println("~~~~~~~~~~~~~test name:" + name + " ,msg:" + msg);
	   }

	   @Test
	   public void testHelloWorld() {
		String name = "World", msg = "Hello World!";
		h.setName(name);
		assertEquals(h.getName(),name);
		assertEquals(h.getMessage(),msg);
		System.out.println("~~~~~~~~~~~~~test name:" + name + " ,msg:" + msg);
	   }

	   @Test
 	   public void testHelloWorld2() {
		 String name = "World2", msg = "Hello World299!";
		 h.setName(name);
		 assertEquals(h.getName(),name);
		 assertEquals(h.getMessage(),msg);
		 System.out.println("~~~~~~~~~~~~~test name:" + name + " ,msg:" + msg);
 	   }
}
