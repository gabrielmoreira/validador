package com.validator.validatable;

public class LongValidatable<T extends LongValidatable<?>> extends AbstractNumberValidatable<T, Long> {
	private static final Long ZERO = new Long(0);

	public LongValidatable(String fieldName, Long fieldValue) {
		super(fieldName, fieldValue);
	}

	public LongValidatable(String objectName, String fieldName, Long fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	@Override
	protected Long zero() {
		return ZERO;
	}

}
