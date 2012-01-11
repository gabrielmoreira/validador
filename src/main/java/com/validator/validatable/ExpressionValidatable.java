package com.validator.validatable;

import com.validator.rule.ExpressionRule;

public class ExpressionValidatable<T extends ExpressionValidatable<?>> extends AbstractValidatable<T, Boolean> {
	public ExpressionValidatable(Boolean expression) {
		super(null, expression);
	}

	public ExpressionValidatable(String fieldName, Boolean expression) {
		super(fieldName, expression);
	}

	public ExpressionValidatable(String objectName, String fieldName, Boolean expression) {
		super(objectName, fieldName, expression);
	}

	public T isTrue() {
		is(ExpressionRule.isTrue());
		return me();
	}

	public T isFalse() {
		is(ExpressionRule.isFalse());
		return me();
	}

	public T isTrue(String rule) {
		is(ExpressionRule.isTrue(rule));
		return me();
	}

	public T isFalse(String rule) {
		is(ExpressionRule.isFalse(rule));
		return me();
	}

	public T isTrue(String rule, Object... parameters) {
		is(ExpressionRule.isTrue(rule, parameters));
		return me();
	}

	public T isFalse(String rule, Object... parameters) {
		is(ExpressionRule.isFalse(rule, parameters));
		return me();
	}

}
