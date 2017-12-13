package com.app.junittest;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import com.app.poc.Calculator;

@RunWith(value = Parameterized.class)
public class SubTest {

	@Parameter(value = 0)
	public int a;
	@Parameter(value = 1)
	public int b;
	@Parameter(value = 2)
	public int r;

	/*
	 * public SubTest(int a, int b, int r) { super(); this.a = a; this.b = b;
	 * this.r = r; }
	 */
	@Parameters(name = "{index}: testSub({0}-{1}) = {2}")
	public static Collection<Integer[]> data() {
		return Arrays.asList(
				new Integer[][] { { 45, 5, 40 }, { 35, 15, 20 }, { 67, 7, 60 }, { 58, 18, 40 }, { 41, 31, 10 } });
	}

	@Test
	public void subTest() {
		// assertEquals(r, new Calculator().sub(a, b));
		assertThat(new Calculator().sub(a, b), is(r));
	}
}
