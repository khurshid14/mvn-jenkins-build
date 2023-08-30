package junittestpkg;
import automationpkg.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculatorClass {

	@Test
	public void test_case1_sum() 
	{
		Calculator obj = new Calculator();
		assertEquals(12, obj.sum(10, 2));
	}
	@Test
	public void test_case2_diff() 
	{
		Calculator obj = new Calculator();
		assertEquals(8, obj.diff(10, 2));
	}
	@Test
	public void test_case3_mul() 
	{
		Calculator obj = new Calculator();
		assertEquals(20, obj.mul(10, 2));
	}
	@Test
	public void test_case4_div() 
	{
		Calculator obj = new Calculator();
		assertEquals(5, obj.div(10, 2));
	}
}
