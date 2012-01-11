package com.validator.rule;

public class FilledRule extends AbstractRule<Object> {

	public static final FilledRule INSTANCE = new FilledRule();

	private static final String RULE = "filled";

	@Override
	public boolean validate(Object value, ValidationResult validationResult) {
		boolean valid = value != null && !"".equals(value.toString().trim());
		if (!valid) {
			validationResult.error(RULE);
		}
		return valid;
	}

}
