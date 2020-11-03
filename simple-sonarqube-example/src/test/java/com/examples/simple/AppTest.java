package com.examples.simple;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	@Test
	public void testGetMessage() {
		assertEquals("Hello World!", new App().getMessage());
	}
} 