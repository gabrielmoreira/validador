package com.validator.validatable;

public class DoubleValidatable<T extends DoubleValidatable<?>> extends AbstractNumberValidatable<T, Double> {
	private static final Double ZERO = new Double(0);

	public DoubleValidatable(String fieldName, Double fieldValue) {
		super(fieldName, fieldValue);
	}

	public DoubleValidatable(String objectName, String fieldName, Double fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	@Override
	protected Double zero() {
		return ZERO;
	}

}
