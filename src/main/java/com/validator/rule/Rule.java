package com.validator.rule;

import com.validator.validatable.Validatable;

public interface Rule<K> {

	public abstract <T extends Validatable<?, ?>> boolean validate(T validatable, ValidationResult validationResult);

	public abstract boolean validate(K value);

	public abstract boolean validate(K value, ValidationResult validationResult);

}