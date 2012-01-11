package com.validator.rule;

public class EmptyValidationResult implements ValidationResult {

	public static final EmptyValidationResult INSTANCE = new EmptyValidationResult();

	private EmptyValidationResult() {
	}

	public void error(String code) {
	}

	public void error(String code, Object... parameters) {
	}

}
