package com.validator.validatable;

import java.util.Date;

public class DateValidatable<T extends DateValidatable<?>> extends CompareValidatable<T, Date> {

	public DateValidatable(String fieldName, Date fieldValue) {
		super(fieldName, fieldValue);
	}

	public DateValidatable(String objectName, String fieldName, Date fieldValue) {
		super(objectName, fieldName, fieldValue);
	}

}
