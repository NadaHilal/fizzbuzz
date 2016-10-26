package com.craftwoman.fizzBuzz;

public class FizzBuzz {

	private static final String RESULT_IF_MULTIPLE_OF_FIVE = "buzz";
	private static final String RESULT_IF_MULTIPLE_OF_THREE = "fizz";

	public String compute(int numberTocheck) {
		if (isMultipleOfThreeAndFive(numberTocheck)) {
			return RESULT_IF_MULTIPLE_OF_THREE + RESULT_IF_MULTIPLE_OF_FIVE;
		}
		if (isMultipleOfThree(numberTocheck)) {
			return RESULT_IF_MULTIPLE_OF_THREE;
		}
		if (isMultipleOfFive(numberTocheck)) {
			return RESULT_IF_MULTIPLE_OF_FIVE;
		}
		return String.valueOf(numberTocheck);
	}

	private boolean isMultipleOfThreeAndFive(int numberTocheck) {
		return isMultipleOfThree(numberTocheck) && isMultipleOfFive(numberTocheck);
	}

	private boolean isMultipleOfFive(int numberTocheck) {
		return numberTocheck % 5 == 0;
	}

	private boolean isMultipleOfThree(int numberTocheck) {
		return numberTocheck % 3 == 0;
	}

}
