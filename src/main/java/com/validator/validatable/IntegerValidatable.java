package com.validator.validatable;

public class IntegerValidatable<T extends IntegerValidatable<?>> extends AbstractNumberValidatable<T, Integer> {
	private static final Integer ZERO = new Integer(0);

	public IntegerValidatable(String fieldName, Integer fieldValue) {
		super(fieldName, fieldValue);
	}

	public IntegerValidatable(String objectName, String fieldName, Integer fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	@Override
	protected Integer zero() {
		return ZERO;
	}

}
