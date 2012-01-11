package com.validator.rule;

public class CompareRule extends AbstractRule<Comparable<?>> {

	private Comparable<?> expectedValue;
	private int min;
	private int max;
	private String rule;

	public CompareRule(Comparable<?> expectedValue, int min, int max, String rule) {
		this.expectedValue = expectedValue;
		this.min = min;
		this.max = max;
		this.rule = rule;
	}

	public static CompareRule greaterThan(Comparable<?> expectedValue) {
		return new CompareRule(expectedValue, 1, 1, "greaterThan");
	}

	public static CompareRule greaterOrequalsTo(Comparable<?> expectedValue) {
		return new CompareRule(expectedValue, 0, 1, "greaterOrequalsTo");
	}

	public static CompareRule equalsTo(Comparable<?> expectedValue) {
		return new CompareRule(expectedValue, 0, 0, "equalsTo");
	}

	public static CompareRule lessThan(Comparable<?> expectedValue) {
		return new CompareRule(expectedValue, -1, -1, "lessThan");
	}

	public static CompareRule lessOrequalsTo(Comparable<?> expectedValue) {
		return new CompareRule(expectedValue, -1, 0, "lessOrequalsTo");
	}

	@Override
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean validate(Comparable fieldValue, ValidationResult validationResult) {
		int compare = Integer.signum(fieldValue.compareTo(this.expectedValue));
		boolean valid = ((this.min <= compare) && (compare <= this.max));
		if (!valid) {
			validationResult.error(rule, fieldValue, expectedValue);
		}
		return valid;
	}
}
