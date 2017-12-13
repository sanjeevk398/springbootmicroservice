package com.app.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.poc.Calculator;

public class AddTest {
	@Test
	public void addTest() {
		assertEquals(15, new Calculator().add(10, 5));

	}
}
