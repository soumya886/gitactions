package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class CalculatorService {

	public int add(int a, int b) {
		return a+b;
	}
}
