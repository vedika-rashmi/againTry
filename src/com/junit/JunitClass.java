package com.junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitClass {

	@Test
	public void Setup() {
    String str="This is my first junit program";
    assertEquals("This is my first junit program",str);
	}
	
}
