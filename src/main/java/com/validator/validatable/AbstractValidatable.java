package com.validator.validatable;

import java.util.ArrayList;
import java.util.List;

import com.validator.rule.FilledRule;
import com.validator.rule.Rule;
import com.validator.rule.ValidationResult;

public abstract class AbstractValidatable<T extends AbstractValidatable<?, ?>, K> implements Validatable<T, K> {

	private String objectName;
	private String fieldName;
	private K fieldValue;

	private List<Rule<?>> rules = new ArrayList<Rule<?>>();
	private boolean invert;
	private boolean optional;

	public AbstractValidatable(String fieldName, K fieldValue) {
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public AbstractValidatable(String objectName, String fieldName, K fieldValue) {
		this.objectName = objectName;
		this.fieldName = fieldName;
		this.fieldValue = fieldValue;
	}

	public String getFieldName() {
		return fieldName;
	}

	public K getFieldValue() {
		return fieldValue;
	}

	@SuppressWarnings("unchecked")
	protected T me() {
		return (T) this;
	}

	public T optional() {
		this.optional = true;
		return me();
	}

	public T filled() {
		this.is(FilledRule.INSTANCE);
		return me();
	}

	public T is(Rule<?> rule) {
		rules.add(rule);
		return me();
	}

	public boolean valid() {
		return valid(null);
	}

	public boolean valid(FieldValidationResult fieldValidationResult) {
		if (fieldValidationResult == null) {
			fieldValidationResult = EmptyFieldValidationResult.INSTANCE;
		}
		boolean verification = verify(fieldValidationResult);
		return invert ? !verification : verification;
	}

	protected boolean verify(FieldValidationResult fieldValidationResult) {
		ValidationResult validationResult = new FieldValidationResultValidatableAdapter(this, fieldValidationResult);
		if (optional && !FilledRule.INSTANCE.validate(this, validationResult)) {
			return true;
		}
		for (Rule<?> rule : rules) {
			if (!rule.validate(this, validationResult)) {
				return false;
			}
		}
		return true;
	}

	public String getObjectName() {
		return objectName;
	}
}
