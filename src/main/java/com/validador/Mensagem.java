package com.validador;

import java.util.Arrays;
import java.util.List;

public class Mensagem {
	private TipoMensagem tipo;
	private String campo;
	private String codigo;
	private String[] chaves;
	private Object[] parametros;
	private String mensagem;

	public String getCampo() {
		return campo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public String[] getChaves() {
		return chaves;
	}

	public Object[] getParametros() {
		return parametros;
	}

	public TipoMensagem getTipo() {
		return tipo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void mensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	@Override
	public String toString() {
		return "Mensagem [tipo=" + tipo + ", chaves=" + Arrays.toString(chaves) + ", parametros=" + Arrays.toString(parametros) + "]";
	}

	public static Builder<?> erro() {
		return new Builder<Builder<?>>().tipo(TipoMensagem.ERRO);
	}

	public static class Builder<T extends Builder<?>> {
		@SuppressWarnings("unchecked")
		private T me = (T) this;
		private Mensagem mensagem = new Mensagem();

		public T campo(String campo) {
			this.mensagem.campo = campo;
			return me;
		}

		public T codigo(String codigo) {
			this.mensagem.codigo = codigo;
			return me;
		}

		public T chaves(String... chaves) {
			this.mensagem.chaves = chaves;
			return me;
		}

		public Builder<?> tipo(TipoMensagem tipo) {
			this.mensagem.tipo = tipo;
			return me;
		}

		/**
		 * Atenção: utilizar parâmetros imutáveis ou clonar para garantir consistência. 
		 */
		public Builder<?> parametros(List<Object> parametros) {
			this.mensagem.parametros = parametros.toArray(new Object[parametros.size()]);
			return me;
		}

		/**
		 * Atenção: utilizar parâmetros imutáveis ou clonar para garantir consistência. 
		 */
		public Builder<?> parametros(Object... parametros) {
			this.mensagem.parametros = parametros;
			return me;
		}

		public Mensagem build() {
			return mensagem;
		}

	}
}
