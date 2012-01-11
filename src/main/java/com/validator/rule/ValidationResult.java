package com.validator.rule;

public interface ValidationResult {
	public void error(String code);

	public void error(String code, Object... parameters);
}
