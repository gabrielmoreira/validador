package com.validator.validatable;

public class EmptyFieldValidationResult implements FieldValidationResult {

	public static final EmptyFieldValidationResult INSTANCE = new EmptyFieldValidationResult();

	private EmptyFieldValidationResult() {
	}

	public void error(String object, String fieldName, String code) {
	}

	public void error(String object, String fieldName, String code, Object... parameters) {
	}

}
