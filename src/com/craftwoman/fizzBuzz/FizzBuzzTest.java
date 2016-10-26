package com.craftwoman.fizzBuzz;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzTest {

	FizzBuzz fizzBuzz = new FizzBuzz();

	@Test
	public void should_return_fizz_if_given_number_three_multiple() {
		// Given
		final int numberTocheck = 9;
		String result;
		// When
		result = fizzBuzz.compute(numberTocheck);
		// Then
		assertEquals("fizz", result);

	}

	@Test
	public void should_return_buzz_if_given_number_five_multiple() {
		// Given
		final int numberTocheck = 10;
		String result;
		// When
		result = fizzBuzz.compute(numberTocheck);
		// Then
		assertEquals("buzz", result);

	}

	@Test
	public void should_return_fizzBuzz_if_given_number_five_and_three_multiple() {
		// Given
		final int numberTocheck = 15;
		String result;
		// When
		result = fizzBuzz.compute(numberTocheck);
		// Then
		assertEquals("fizzbuzz", result);

	}

	@Test
	public void should_return_given_number_if_it_is_not_five_nor_three_multiple() {
		// Given
		final int numberTocheck = 17;
		String result;
		// When
		result = fizzBuzz.compute(numberTocheck);
		// Then
		assertEquals(numberTocheck + "", result);

	}
}
