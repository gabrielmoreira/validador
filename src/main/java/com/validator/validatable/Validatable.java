package com.validator.validatable;

import com.validator.rule.Rule;

public interface Validatable<T extends Validatable<?, ?>, K> {

	public abstract String getFieldName();

	public abstract K getFieldValue();

	public abstract T optional();

	public abstract T filled();

	public abstract T is(Rule<?> rule);

	public abstract boolean valid();

	public abstract boolean valid(FieldValidationResult fieldValidationResult);

	public abstract String getObjectName();

}