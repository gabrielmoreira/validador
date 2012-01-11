package com.validator.validatable;

public abstract class AbstractNumberValidatable<T extends AbstractNumberValidatable<?, ?>, K extends Number> extends CompareValidatable<T, K> {
	public AbstractNumberValidatable(String fieldName, K fieldValue) {
		super(fieldName, fieldValue);
	}

	public AbstractNumberValidatable(String objectName, String fieldName, K fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	protected abstract K zero();

	public T greaterThanZero() {
		greaterThan(zero());
		return me();
	}

	public T lessThanZero() {
		lessThan(zero());
		return me();
	}

	public T greaterOrequalsToZero() {
		greaterOrequalsTo(zero());
		return me();
	}

	public T lessOrequalsToZero() {
		lessOrequalsTo(zero());
		return me();
	}

	public T equalsToZero() {
		equalsTo(zero());
		return me();
	};
}
