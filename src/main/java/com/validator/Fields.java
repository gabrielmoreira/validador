package com.validator;

import java.math.BigDecimal;
import java.util.Date;

import com.validator.validatable.BigDecimalValidatable;
import com.validator.validatable.ByteValidatable;
import com.validator.validatable.DateValidatable;
import com.validator.validatable.DoubleValidatable;
import com.validator.validatable.ExpressionValidatable;
import com.validator.validatable.IntegerValidatable;
import com.validator.validatable.LongValidatable;
import com.validator.validatable.ObjectValidatable;
import com.validator.validatable.ShortValidatable;
import com.validator.validatable.StringValidatable;

public class Fields {

	public static BigDecimalValidatable<?> number(String fieldName, BigDecimal fieldValue) {
		return new BigDecimalValidatable<BigDecimalValidatable<?>>(fieldName, fieldValue);
	}

	public static BigDecimalValidatable<?> number(String objectName, String fieldName, BigDecimal fieldValue) {
		return new BigDecimalValidatable<BigDecimalValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static ByteValidatable<?> number(String fieldName, Byte fieldValue) {
		return new ByteValidatable<ByteValidatable<?>>(fieldName, fieldValue);
	}

	public static ByteValidatable<?> number(String objectName, String fieldName, Byte fieldValue) {
		return new ByteValidatable<ByteValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static DoubleValidatable<?> number(String fieldName, Double fieldValue) {
		return new DoubleValidatable<DoubleValidatable<?>>(fieldName, fieldValue);
	}

	public static DoubleValidatable<?> number(String objectName, String fieldName, Double fieldValue) {
		return new DoubleValidatable<DoubleValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static IntegerValidatable<?> number(String fieldName, Integer fieldValue) {
		return new IntegerValidatable<IntegerValidatable<?>>(fieldName, fieldValue);
	}

	public static IntegerValidatable<?> number(String objectName, String fieldName, Integer fieldValue) {
		return new IntegerValidatable<IntegerValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static LongValidatable<?> number(String fieldName, Long fieldValue) {
		return new LongValidatable<LongValidatable<?>>(fieldName, fieldValue);
	}

	public static LongValidatable<?> number(String objectName, String fieldName, Long fieldValue) {
		return new LongValidatable<LongValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static ShortValidatable<?> number(String fieldName, Short fieldValue) {
		return new ShortValidatable<ShortValidatable<?>>(fieldName, fieldValue);
	}

	public static ShortValidatable<?> number(String objectName, String fieldName, Short fieldValue) {
		return new ShortValidatable<ShortValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static StringValidatable<?> text(String objectName, String fieldName, String fieldValue) {
		return new StringValidatable<StringValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static StringValidatable<?> text(String fieldName, String fieldValue) {
		return new StringValidatable<StringValidatable<?>>(fieldName, fieldValue);
	}

	public static DateValidatable<?> date(String objectName, String fieldName, Date fieldValue) {
		return new DateValidatable<DateValidatable<?>>(objectName, fieldName, fieldValue);
	}

	public static DateValidatable<?> date(String fieldName, Date fieldValue) {
		return new DateValidatable<DateValidatable<?>>(fieldName, fieldValue);
	}

	public static ExpressionValidatable<?> expression(boolean expression) {
		return new ExpressionValidatable<ExpressionValidatable<?>>(expression);
	}

	public static ExpressionValidatable<?> expression(String fieldName, boolean expression) {
		return new ExpressionValidatable<ExpressionValidatable<?>>(fieldName, expression);
	}

	public static ExpressionValidatable<?> expression(String objectName, String fieldName, boolean expression) {
		return new ExpressionValidatable<ExpressionValidatable<?>>(objectName, fieldName, expression);
	}

	public static ObjectValidatable<?> object(String fieldName, Object object) {
		return new ObjectValidatable<ObjectValidatable<?>>(fieldName, object);
	}

	public static ObjectValidatable<?> object(String objectName, String fieldName, Object object) {
		return new ObjectValidatable<ObjectValidatable<?>>(objectName, fieldName, object);
	}
}
