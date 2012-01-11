package com.validator.rule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.regex.Pattern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PatternRuleTest {

	private static final String RULE = "matchPattern";
	private static final String RULE_HAS = "hasPattern";
	private ValidationResult validationResult;

	@Before
	public void setup() {
		validationResult = mock(ValidationResult.class);
	}

	@After
	public void validate() {
		validateMockitoUsage();
	}

	@Test
	public void patternValid() {
		PatternRule pattern = PatternRule.matches("foo[0-9]{4}");
		assertTrue(pattern.validate("foo1337", validationResult));
		verifyNoMoreInteractions(validationResult);
	}

	@Test
	public void patternValidDotAll() {
		PatternRule pattern = PatternRule.matches("foo[0-9]{4}.", Pattern.DOTALL);
		assertTrue(pattern.validate("foo1337\n", validationResult));
		verifyNoMoreInteractions(validationResult);
	}

	@Test
	public void patternValidDotAll2() {
		PatternRule pattern = new PatternRule(Pattern.compile("foo[0-9]{4}.", Pattern.DOTALL), false);
		assertTrue(pattern.validate("foo1337\n", validationResult));
		verifyNoMoreInteractions(validationResult);
	}

	@Test
	public void patternInvalid() {
		PatternRule pattern = PatternRule.matches("foo[0-9]{4}");
		assertFalse(pattern.validate("1337", validationResult));
		verify(validationResult).error(RULE, "1337", "foo[0-9]{4}");
	}

	@Test
	public void patternInvalid2() {
		PatternRule pattern = PatternRule.matches("[0-9]{4}");
		assertFalse(pattern.validate("foo1337", validationResult));
		verify(validationResult).error(RULE, "foo1337", "[0-9]{4}");
	}

	@Test
	public void patternHasValid() {
		PatternRule pattern = PatternRule.hasPattern("[0-9]{4}");
		assertTrue(pattern.validate("foo1337", validationResult));
		verifyNoMoreInteractions(validationResult);
	}

	@Test
	public void patternHasValidDotAll() {
		PatternRule pattern = PatternRule.hasPattern("[0-9]{4}.", Pattern.DOTALL);
		assertTrue(pattern.validate("foo1337\n", validationResult));
		verifyNoMoreInteractions(validationResult);
	}

	@Test
	public void patternHasInvalid() {
		PatternRule pattern = PatternRule.hasPattern("[0-9]{4}");
		assertFalse(pattern.validate("foo133", validationResult));
		verify(validationResult).error(RULE_HAS, "foo133", "[0-9]{4}");
	}

	@Test
	public void patternPatternValid() {
		PatternRule pattern = PatternRule.matches(Pattern.compile("foo[0-9]{4}"));
		assertTrue(pattern.validate("foo1337", validationResult));
		verifyNoMoreInteractions(validationResult);
	}

}
