package com.validator;

import static com.validator.Fields.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;
import java.util.Date;

import org.junit.Test;

import com.validator.Fields;
import com.validator.validatable.BigDecimalValidatable;
import com.validator.validatable.ByteValidatable;
import com.validator.validatable.DateValidatable;
import com.validator.validatable.DoubleValidatable;
import com.validator.validatable.IntegerValidatable;
import com.validator.validatable.LongValidatable;
import com.validator.validatable.ShortValidatable;
import com.validator.validatable.StringValidatable;

public class FieldsTest {

	private static final String FIELD_NAME = "MyFieldName";
	private static final String OBJECT_NAME = "MyObjectName";

	@Test
	public void instanceTest() {
		Fields fieldNamesInstance = new Fields();
		assertNotNull(fieldNamesInstance);
	}

	@Test
	public void numberBigDecimalTest() {
		BigDecimal fieldValue = new BigDecimal(10);
		BigDecimalValidatable<?> validatable = number(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberBigDecimalTest2() {
		BigDecimal fieldValue = new BigDecimal(10);
		BigDecimalValidatable<?> validatable = number(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberByteTest() {
		Byte fieldValue = new Byte((byte) 10);
		ByteValidatable<?> validatable = number(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberByteTest2() {
		Byte fieldValue = new Byte((byte) 10);
		ByteValidatable<?> validatable = number(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberDoubleTest() {
		Double fieldValue = new Double(10.0D);
		DoubleValidatable<?> validatable = number(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberDoubleTest2() {
		Double fieldValue = new Double(10.0D);
		DoubleValidatable<?> validatable = number(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberIntegerTest() {
		Integer fieldValue = new Integer(10);
		IntegerValidatable<?> validatable = number(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberIntegerTest2() {
		Integer fieldValue = new Integer(10);
		IntegerValidatable<?> validatable = number(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberLongTest() {
		Long fieldValue = new Long(10);
		LongValidatable<?> validatable = number(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberLongTest2() {
		Long fieldValue = new Long(10);
		LongValidatable<?> validatable = number(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberShortTest() {
		Short fieldValue = new Short((short) 10);
		ShortValidatable<?> validatable = number(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void numberShortTest2() {
		Short fieldValue = new Short((short) 10);
		ShortValidatable<?> validatable = number(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void textTest() {
		String fieldValue = "fieldValue";
		StringValidatable<?> validatable = text(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void textTest2() {
		String fieldValue = "fieldValue";
		StringValidatable<?> validatable = text(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void dateTest() {
		Date fieldValue = new Date();
		DateValidatable<?> validatable = date(FIELD_NAME, fieldValue);
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}

	@Test
	public void dateTest2() {
		Date fieldValue = new Date();
		DateValidatable<?> validatable = date(OBJECT_NAME, FIELD_NAME, fieldValue);
		assertEquals(OBJECT_NAME, validatable.getObjectName());
		assertEquals(FIELD_NAME, validatable.getFieldName());
		assertEquals(fieldValue, validatable.getFieldValue());
	}
}
