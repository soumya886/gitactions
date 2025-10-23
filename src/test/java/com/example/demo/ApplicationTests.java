package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@Autowired
	CalculatorService calculatorService;
	@Test
	void testCalculator() {
		assertEquals(10, calculatorService.add(5, 5));
	}

}
