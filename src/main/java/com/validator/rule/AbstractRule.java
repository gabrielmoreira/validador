package com.validator.rule;

import com.validator.validatable.Validatable;

public abstract class AbstractRule<K> implements Rule<K> {

	public <T extends Validatable<?, ?>> boolean validate(T validatable, ValidationResult validationResult) {
		@SuppressWarnings("unchecked")
		K value = (K) validatable.getFieldValue();
		return validate(value, validationResult);
	}

	public boolean validate(K value) {
		return validate(value, EmptyValidationResult.INSTANCE);
	}

	public abstract boolean validate(K value, ValidationResult validationResult);

}
