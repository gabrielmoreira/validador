package com.validator;

import java.util.Arrays;
import java.util.List;

public class Message {
	private MessageType type;
	private String fieldName;
	private String code;
	private String[] keys;
	private Object[] parameters;
	private String message;

	public String getFieldName() {
		return fieldName;
	}

	public String getMessage() {
		return message;
	}

	public String[] getKeys() {
		return keys;
	}

	public Object[] getParameters() {
		return parameters;
	}

	public MessageType getType() {
		return type;
	}

	public String getCode() {
		return code;
	}

	public void message(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message [" + (type != null ? "type=" + type + ", " : "") + (fieldName != null ? "fieldName=" + fieldName + ", " : "") + (code != null ? "code=" + code + ", " : "") + (keys != null ? "keys=" + Arrays.toString(keys) + ", " : "") + (parameters != null ? "parameters=" + Arrays.toString(parameters) + ", " : "") + (message != null ? "message=" + message : "") + "]";
	}

	public static Builder<?> error() {
		return new Builder<Builder<?>>().type(MessageType.ERROR);
	}

	public static Builder<?> warn() {
		return new Builder<Builder<?>>().type(MessageType.WARN);
	}

	public static Builder<?> info() {
		return new Builder<Builder<?>>().type(MessageType.INFO);
	}

	public static Builder<?> success() {
		return new Builder<Builder<?>>().type(MessageType.SUCCESS);
	}

	public static Builder<?> type(MessageType type) {
		return new Builder<Builder<?>>().type(type);
	}

	public static class Builder<T extends Builder<?>> {
		@SuppressWarnings("unchecked")
		private T me = (T) this;
		private Message message = new Message();

		public T fieldName(String fieldName) {
			this.message.fieldName = fieldName;
			return me;
		}

		public T code(String code) {
			this.message.code = code;
			return me;
		}

		public T keys(String... keys) {
			this.message.keys = keys;
			return me;
		}

		public Builder<?> type(MessageType type) {
			this.message.type = type;
			return me;
		}

		/**
		 * Atenção: utilizar parâmetros imutáveis ou clonar para garantir consistência. 
		 */
		public Builder<?> parameters(List<Object> parameters) {
			this.message.parameters = parameters.toArray(new Object[parameters.size()]);
			return me;
		}

		/**
		 * Atenção: utilizar parâmetros imutáveis ou clonar para garantir consistência. 
		 */
		public Builder<?> parameters(Object... parameters) {
			this.message.parameters = parameters;
			return me;
		}

		public Message build() {
			return message;
		}

	}
}
