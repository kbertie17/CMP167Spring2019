package aaaa;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDMV {

	@Test
	void test() {
		System.out.println("Testing for ExpirationDate");
		assert ((DMV.ExpirationDate(2014) != 2024)): "Test has not passed";
		assert ((DMV.ExpirationDate(2014) != 2023)): "Test has not passed";
	}

}
