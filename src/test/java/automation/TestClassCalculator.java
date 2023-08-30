package automation;

import static org.junit.Assert.*;

import org.junit.Test;

import automationpkg.Calculator;

public class TestClassCalculator {

	Calculator calc = new Calculator();
	
	
	
	@Test
	public void test_sum() 
	{
		assertEquals(12, calc.sum(10,2));
	}
	
	@Test
	public void test_diff() 
	{
		assertEquals(8, calc.diff(10,2));
	}
	
	@Test
	public void test_mul() 
	{
		assertEquals(20, calc.mul(10,2));
	}
	
	@Test
	public void test_div() 
	{
		assertEquals(5, calc.div(10,2));
	}
	
}
