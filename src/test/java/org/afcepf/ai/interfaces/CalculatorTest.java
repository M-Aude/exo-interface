package org.afcepf.ai.interfaces;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	@Test
	void test1() {
		Calculator addition = (int a, int b) -> a + b;
		Calculator multiplication = (int a, int b) -> a * b;
		
		System.out.println(addition.calculate(1, 1));
		System.out.println(multiplication.calculate(9, 4));
	}
}
