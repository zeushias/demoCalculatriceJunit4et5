package com.zeushias.demoTDDCalculatrice;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatriceServiceTest {

	private CalculatriceService calculatriceService;

	@Before
	public void beforeTest() {
		calculatriceService = new CalculatriceService();
		System.out.println("Setup");
	}

	@Test
	public void testAddition() {
		int reponse = calculatriceService.addition(10, 5);
		assertEquals(15, reponse);
	}

	@Test(expected = ArithmeticException.class)
	public void testDivisionWithZero() {
		calculatriceService.division(10, 0);
	}

	@Test(timeout = (long) 0.002)
	public void testDivision() {
		int reponse = calculatriceService.division(10, 5);
		assertEquals(2, reponse);
	}

	@Ignore
	@Test()
	public void testDivision1() {
		int reponse = calculatriceService.division(2, 5);
		assertEquals(0, reponse);
	}

	@After
	public void afterTest() {
		calculatriceService = null;
		System.out.println("TearDown");
	}
}
