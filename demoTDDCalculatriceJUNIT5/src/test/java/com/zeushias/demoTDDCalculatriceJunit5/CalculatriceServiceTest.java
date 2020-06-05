package com.zeushias.demoTDDCalculatriceJunit5;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class CalculatriceServiceTest {

	private CalculatriceService calculatriceService;

	@BeforeEach
	public void beforeTest() {
		calculatriceService = new CalculatriceService();
		System.out.println("Setup");
	}

	@Test
	public void testAddition() {
		int reponse = calculatriceService.addition(10, 5);
		assertEquals(15, reponse);
	}

	@Test
	public void testDivisionWithZero() {
		Assertions.assertThrows(ArithmeticException.class, () -> calculatriceService.division(10, 0));
	}

	@Test()
	public void testDivision() {
		int reponse = calculatriceService.division(10, 5);
		Assertions.assertTimeout(Duration.ofMillis(2), () -> assertEquals(2, reponse));
	}

	@Disabled
	@Test()
	public void testDivision1() {
		int reponse = calculatriceService.division(2, 5);
		assertEquals(0, reponse);
	}

	@AfterEach
	public void afterTest() {
		calculatriceService = null;
		System.out.println("TearDown");
	}

}
