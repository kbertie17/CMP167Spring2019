package week10;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest2 {
	
	@BeforeClass
	public static void greet() {
		System.out.println("Before everything");
	}
	
	@Before
	public void perMethod() {
		System.out.println("Before each test");
	}
	
	@After 
	public void afterMethod() {
		System.out.println("After each test");
	}
	
	@AfterClass
	public static void after() {
		System.out.println("After everything");
	}
	
	@Test
	public void test1() {
		assertEquals(0 , Calculate.multiply(0, 1));
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		assertEquals(1 , Calculate.multiply(1, 1));
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		assertEquals(2.0 , Calculate.multiply(1.0, 2.0), 0.5);
		System.out.println("Test 3");
	}


}
