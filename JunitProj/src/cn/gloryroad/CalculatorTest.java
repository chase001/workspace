package cn.gloryroad;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	private static Calculator Calculator = new Calculator();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("@BeforeClass");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("@AfterClass");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("���Կ�ʼ");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("���Խ���");
	}

	@Test
	public void testAdd() {
		Calculator.add(2,2);
		assertEquals(4, Calculator.getResult());
		//fail("Not yet implemented");
		
	}

	@Test
	public void testsubtract() {
		Calculator.subtract(4,2);
		assertEquals(2, Calculator.getResult());
		//fail("Not yet implemented");
		
	}

	@Ignore
	public void testMultiply() {
		fail("Not yet implemented");
		
	}
	
	@Test(timeout = 2000)
	public void testDivide() {
		for(;;);
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void testDivideByZero() {
		Calculator.divide(4,0);
		
	}
}