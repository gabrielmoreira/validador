package com.validator.validatable;

import java.math.BigDecimal;

public class BigDecimalValidatable<T extends BigDecimalValidatable<?>> extends AbstractNumberValidatable<T, BigDecimal> {

	public BigDecimalValidatable(String fieldName, BigDecimal fieldValue) {
		super(fieldName, fieldValue);
	}

	public BigDecimalValidatable(String objectName, String fieldName, BigDecimal fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	@Override
	protected BigDecimal zero() {
		return BigDecimal.ZERO;
	}

}
