package com.validator.validatable;

public class ObjectValidatable<T extends ObjectValidatable<?>> extends AbstractValidatable<T, Object> {

	public ObjectValidatable(String fieldName, Object fieldValue) {
		super(fieldName, fieldValue);
	}

	public ObjectValidatable(String objectName, String fieldName, Object fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

}
