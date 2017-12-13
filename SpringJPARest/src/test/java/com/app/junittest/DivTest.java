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

@RunWith(Parameterized.class)
public class DivTest {

	@Parameter(0)
	public double inputa;
	@Parameter(1)
	public double inputb;
	@Parameter(2)
	public double result;

	@Parameters
	public static Collection<Double[]> data() {
		return Arrays.asList(new Double[][] { { 5.0, 3.0, 15.0 }, { 6.0, 24.0, 6.0 }, { 4.0, 24.0, 8.0 },
				{ 10.0, 100.0, 10.0 }, { 7.0, 49.0, 7.0 }, { 9.0, 18.0, 2.0 } });
	}

	@Test
	public void div() {
		// assertEquals(5.0, new Calculator().div(15, 3), 0.001);
		assertThat(new Calculator().div(inputa, inputb), is(result));
	}

}
