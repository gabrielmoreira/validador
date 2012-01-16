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

	public static <T extends BigDecimalValidatable<?>> BigDecimalValidatable<T> number(String fieldName, BigDecimal fieldValue) {
		return new BigDecimalValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends BigDecimalValidatable<?>> BigDecimalValidatable<T> number(String objectName, String fieldName, BigDecimal fieldValue) {
		return new BigDecimalValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends ByteValidatable<?>> ByteValidatable<T> number(String fieldName, Byte fieldValue) {
		return new ByteValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends ByteValidatable<?>> ByteValidatable<T> number(String objectName, String fieldName, Byte fieldValue) {
		return new ByteValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends DoubleValidatable<?>> DoubleValidatable<T> number(String fieldName, Double fieldValue) {
		return new DoubleValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends DoubleValidatable<?>> DoubleValidatable<T> number(String objectName, String fieldName, Double fieldValue) {
		return new DoubleValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends IntegerValidatable<?>> IntegerValidatable<T> number(String fieldName, Integer fieldValue) {
		return new IntegerValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends IntegerValidatable<?>> IntegerValidatable<T> number(String objectName, String fieldName, Integer fieldValue) {
		return new IntegerValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends LongValidatable<?>> LongValidatable<T> number(String fieldName, Long fieldValue) {
		return new LongValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends LongValidatable<?>> LongValidatable<T> number(String objectName, String fieldName, Long fieldValue) {
		return new LongValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends ShortValidatable<?>> ShortValidatable<T> number(String fieldName, Short fieldValue) {
		return new ShortValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends ShortValidatable<?>> ShortValidatable<T> number(String objectName, String fieldName, Short fieldValue) {
		return new ShortValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends StringValidatable<?>> StringValidatable<T> text(String objectName, String fieldName, String fieldValue) {
		return new StringValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends StringValidatable<?>> StringValidatable<T> text(String fieldName, String fieldValue) {
		return new StringValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends DateValidatable<?>> DateValidatable<T> date(String objectName, String fieldName, Date fieldValue) {
		return new DateValidatable<T>(objectName, fieldName, fieldValue);
	}

	public static <T extends DateValidatable<?>> DateValidatable<T> date(String fieldName, Date fieldValue) {
		return new DateValidatable<T>(fieldName, fieldValue);
	}

	public static <T extends ExpressionValidatable<?>> ExpressionValidatable<T> expression(boolean expression) {
		return new ExpressionValidatable<T>(expression);
	}

	public static <T extends ExpressionValidatable<?>> ExpressionValidatable<T> expression(String fieldName, boolean expression) {
		return new ExpressionValidatable<T>(fieldName, expression);
	}

	public static <T extends ExpressionValidatable<?>> ExpressionValidatable<T> expression(String objectName, String fieldName, boolean expression) {
		return new ExpressionValidatable<T>(objectName, fieldName, expression);
	}

	public static <T extends ObjectValidatable<?>> ObjectValidatable<T> object(String fieldName, Object object) {
		return new ObjectValidatable<T>(fieldName, object);
	}

	public static <T extends ObjectValidatable<?>> ObjectValidatable<T> object(String objectName, String fieldName, Object object) {
		return new ObjectValidatable<T>(objectName, fieldName, object);
	}
}
