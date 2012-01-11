package com.validator;

import static com.validator.Fields.*;
import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class ValidateTest {

	@Test
	public void sampleTest() {
		Validate validate = new Validate();
		assertFalse(validate.that(number("bignumber", (BigDecimal) null).filled()));
		assertFalse(validate.that(number("bignumber", new BigDecimal(1)).greaterThan(BigDecimal.TEN)));
		assertFalse(validate.that(text("myfield", "foobar").equalsTo("foobar1")));
		assertFalse(validate.that(text("myfield", "foobar").matches("foobar1")));
		assertTrue(validate.that(text("myfield", "foobar").equalsTo("foobar")));
		assertTrue(validate.that(text("myfield", "foobar").matches("foobar")));
		assertTrue(validate.hasError());
	}
}
