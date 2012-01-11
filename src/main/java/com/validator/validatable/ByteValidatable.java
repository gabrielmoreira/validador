package com.validator.validatable;

public class ByteValidatable<T extends ByteValidatable<?>> extends AbstractNumberValidatable<T, Byte> {
	private static final byte ZERO = (byte) 0;

	public ByteValidatable(String fieldName, Byte fieldValue) {
		super(fieldName, fieldValue);
	}

	public ByteValidatable(String objectName, String fieldName, Byte fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

	@Override
	protected Byte zero() {
		return ZERO;
	}

}
