package com.app.junittest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.app.poc.Calculator;

public class MultiplyTest {

	@Test
	public void multiplyTest() {
		assertEquals(240, new Calculator().multi(48, 5));
		assertEquals(200, new Calculator().multi(40, 5));
	}

}
