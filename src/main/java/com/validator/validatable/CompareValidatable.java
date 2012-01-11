package com.validator.validatable;

import com.validator.rule.CompareRule;

public abstract class CompareValidatable<T extends CompareValidatable<?, ?>, K> extends AbstractValidatable<T, K> {
	public CompareValidatable(String fieldName, K fieldValue) {
		super(fieldName, fieldValue);
	}

	public CompareValidatable(String objectName, String fieldName, K fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	public T greaterThan(K expectedValue) {
		filled();
		is(CompareRule.greaterThan((Comparable<?>) expectedValue));
		return me();
	}

	public T greaterOrequalsTo(K expectedValue) {
		filled();
		is(CompareRule.greaterOrequalsTo((Comparable<?>) expectedValue));
		return me();
	}

	public T equalsTo(K expectedValue) {
		filled();
		is(CompareRule.equalsTo((Comparable<?>) expectedValue));
		return me();
	}

	public T lessThan(K expectedValue) {
		filled();
		is(CompareRule.lessThan((Comparable<?>) expectedValue));
		return me();
	}

	public T lessOrequalsTo(K expectedValue) {
		filled();
		is(CompareRule.lessOrequalsTo((Comparable<?>) expectedValue));
		return me();
	}

}
