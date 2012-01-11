package com.validator.validatable;

import com.validator.rule.ValidationResult;

public class FieldValidationResultValidatableAdapter implements ValidationResult {

	private Validatable<?, ?> validatable;
	private FieldValidationResult result;

	public FieldValidationResultValidatableAdapter(Validatable<?, ?> validatable, FieldValidationResult result) {
		this.validatable = validatable;
		this.result = result;
	}

	public void error(String code) {
		result.error(validatable.getObjectName(), validatable.getFieldName(), code);
	}

	public void error(String code, Object... parameters) {
		result.error(validatable.getObjectName(), validatable.getFieldName(), code, parameters);
	}

}
