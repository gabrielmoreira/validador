package com.validator.rule;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternRule extends AbstractRule<String> {

	private static final String RULE = "matchPattern";
	private static final String RULE_HAS = "hasPattern";

	private String rule;
	private Pattern pattern;
	private boolean has;

	public PatternRule(Pattern pattern) {
		this.pattern = pattern;
		this.rule = RULE;
	}

	public PatternRule(Pattern pattern, boolean has) {
		this.pattern = pattern;
		this.has = has;
		this.rule = has ? RULE_HAS : RULE;
	}

	public static PatternRule matches(String pattern) {
		return matches(Pattern.compile(pattern));
	}

	public static PatternRule matches(String pattern, int flags) {
		return matches(Pattern.compile(pattern, flags));
	}

	public static PatternRule matches(Pattern pattern) {
		return new PatternRule(pattern);
	}

	public static PatternRule hasPattern(String pattern) {
		return hasPattern(Pattern.compile(pattern));
	}

	public static PatternRule hasPattern(String pattern, int flags) {
		return hasPattern(Pattern.compile(pattern, flags));
	}

	public static PatternRule hasPattern(Pattern pattern) {
		return new PatternRule(pattern, true);
	}

	@Override
	public boolean validate(String value, ValidationResult validationResult) {
		Matcher matcher = pattern.matcher(value);
		boolean valid = has ? matcher.find() : matcher.matches();
		if (!valid) {
			validationResult.error(rule, value, pattern.pattern());
		}
		//TODO Implementar forma de capturar os grupos. Exemplo: if (result instanceof ResultComCaptura) resultComCaptura.set(matcher);
		return valid;
	}

}
