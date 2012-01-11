package com.validator.rule;

public class ExpressionRule extends AbstractRule<Boolean> {

	private static final String RULE_TRUE = "mustBeTrue";
	private static final String RULE_FALSE = "mustBeFalse";
	private String rule;
	private Boolean expected;
	private Object[] parameters;

	public ExpressionRule(Boolean expected) {
		this.expected = expected;
		this.rule = expected ? RULE_TRUE : RULE_FALSE;
	}

	public ExpressionRule(boolean expected, String rule) {
		this.expected = expected;
		this.rule = rule;
	}

	public ExpressionRule(boolean expected, String rule, Object[] parameters) {
		this.expected = expected;
		this.rule = rule;
		this.parameters = parameters;
	}

	@Override
	public boolean validate(Boolean value, ValidationResult validationResult) {
		if (expected != value) {
			if (parameters == null) {
				validationResult.error(rule);
			} else {
				validationResult.error(rule, parameters);
			}
			return false;
		}
		return true;
	}

	public static ExpressionRule isTrue() {
		return new ExpressionRule(true);
	}

	public static ExpressionRule isFalse() {
		return new ExpressionRule(false);
	}

	public static ExpressionRule isTrue(String rule) {
		return new ExpressionRule(true, rule);
	}

	public static ExpressionRule isFalse(String rule) {
		return new ExpressionRule(false, rule);
	}

	public static ExpressionRule isTrue(String rule, Object... parameters) {
		return new ExpressionRule(true, rule, parameters);
	}

	public static ExpressionRule isFalse(String rule, Object... parameters) {
		return new ExpressionRule(false, rule, parameters);
	}

}
