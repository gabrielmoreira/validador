package com.validator.validatable;

public interface FieldValidationResult {

	public void error(String object, String fieldName, String code);

	public void error(String object, String fieldName, String code, Object... parameters);
}
