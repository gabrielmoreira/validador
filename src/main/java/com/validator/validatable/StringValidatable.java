package com.validator.validatable;

import java.util.regex.Pattern;

import com.validator.rule.PatternRule;

public class StringValidatable<T extends StringValidatable<?>> extends CompareValidatable<T, String> {

	public StringValidatable(String objectName, String fieldName, String fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	public StringValidatable(String fieldName, String fieldValue) {
		super(fieldName, fieldValue);
	}

	public Validatable<?, ?> matches(String pattern) {
		is(PatternRule.matches(Pattern.compile(pattern)));
		return me();
	}

	public Validatable<?, ?> matches(String pattern, int flags) {
		is(PatternRule.matches(Pattern.compile(pattern, flags)));
		return me();
	}

	public Validatable<?, ?> matches(Pattern pattern) {
		is(PatternRule.matches(pattern));
		return me();
	}

	public Validatable<?, ?> hasPattern(String pattern) {
		is(PatternRule.hasPattern(Pattern.compile(pattern)));
		return me();
	}

	public Validatable<?, ?> hasPattern(String pattern, int flags) {
		is(PatternRule.hasPattern(Pattern.compile(pattern, flags)));
		return me();
	}

	public Validatable<?, ?> hasPattern(Pattern pattern) {
		is(PatternRule.hasPattern(pattern));
		return me();
	}
}
