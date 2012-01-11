package com.validator.rule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.validator.rule.FilledRule;
import com.validator.rule.ValidationResult;

public class RequiredRuleTest {

	private static final String RULE = "filled";
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
	public void filledNull() {
		assertFalse(FilledRule.INSTANCE.validate((String) null, validationResult));
		verify(validationResult).error(RULE);
	}

	@Test
	public void filledBlank() {
		assertFalse(FilledRule.INSTANCE.validate("", validationResult));
		verify(validationResult).error(RULE);
	}

	@Test
	public void filledSpaceEnterTabNewLine() {
		assertFalse(FilledRule.INSTANCE.validate(" \t\r\n ", validationResult));
		verify(validationResult).error(RULE);
	}

	@Test
	public void filledValid() {
		assertTrue(FilledRule.INSTANCE.validate("Ok", validationResult));
		verifyNoMoreInteractions(validationResult);
	}

}
