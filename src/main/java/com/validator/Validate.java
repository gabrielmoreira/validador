package com.validator;

import java.util.List;

import com.validator.validatable.Validatable;

public class Validate {

	private FieldValidationResultMessageAdapter result = new FieldValidationResultMessageAdapter();

	public boolean that(Validatable<?, ?> validatable) {
		return validatable.valid(result);
	}

	public List<Message> getMessages() {
		return result.getMessages();
	}

	public List<Message> getErrors() {
		return result.getErrors();
	}

	public boolean valid() {
		return getErrors().isEmpty();
	}

	public boolean hasError() {
		return !valid();
	}

}
