package com.validator;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

import com.validator.validatable.FieldValidationResult;

public class FieldValidationResultMessageAdapter implements FieldValidationResult {
	private String prefix;
	private List<Message> messages = new ArrayList<Message>();

	public void error(String object, String fieldName, String code) {
		messages.add(buildMessage(object, fieldName, code).build());
	}

	public void error(String object, String fieldName, String code, Object... parameters) {
		messages.add(buildMessage(object, fieldName, code).parameters(parameters).build());
	}

	private Message.Builder<?> buildMessage(String object, String fieldName, String code) {
		return Message.error().fieldName(fieldName).code(code).keys(buildKeys(object, fieldName, code));
	}

	private String[] buildKeys(String object, String fieldName, String code) {
		LinkedHashSet<String> keys = new LinkedHashSet<String>();
		if (prefix != null) {
			keys.add(buildKey(prefix, object, fieldName, code));
		}
		if (object != null) {
			keys.add(buildKey(object, fieldName, code));
		}
		keys.add(buildKey(fieldName, code));
		keys.add(buildKey(code));
		return keys.toArray(new String[keys.size()]);
	}

	private String buildKey(String... fieldNames) {
		StringBuilder sb = new StringBuilder();
		for (String fieldName : fieldNames) {
			if (fieldName != null) {
				sb.append('.').append(fieldName);
			}
		}
		return sb.substring(1);
	}

	public List<Message> getMessages() {
		return messages;
	}

	public String getPrefix() {
		return prefix;
	}

	public List<Message> getErrors() {
		List<Message> errors = new ArrayList<Message>();
		for (Message message : this.messages) {
			if (message.getType() == MessageType.ERROR) {
				errors.add(message);
			}
		}
		return errors;
	}
}
