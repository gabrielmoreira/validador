package com.validator.validatable;

public class ShortValidatable<T extends ShortValidatable<?>> extends AbstractNumberValidatable<T, Short> {
	private static final short ZERO = (short) 0;

	public ShortValidatable(String fieldName, Short fieldValue) {
		super(fieldName, fieldValue);
	}

	public ShortValidatable(String objectName, String fieldName, Short fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	@Override
	protected Short zero() {
		return ZERO;
	}

}
