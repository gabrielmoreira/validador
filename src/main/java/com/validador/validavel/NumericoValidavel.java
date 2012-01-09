package com.validador.validavel;

public abstract class NumericoValidavel<T extends NumericoValidavel<?, ?>, K extends Number> extends ComparavelValidavel<T, K> {
	public NumericoValidavel(String nomeCampo, K valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public NumericoValidavel(String nomeObjeto, String nomeCampo, K valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

	protected abstract K zero();

	public T maiorQueZero() {
		maiorQue(zero());
		return me();
	}

	public T menorQueZero() {
		menorQue(zero());
		return me();
	}

	public T maiorOuIgualQueZero() {
		maiorOuIgualQue(zero());
		return me();
	}

	public T menorOuIgualQueZero() {
		menorOuIgualQue(zero());
		return me();
	}

	public T igualQueZero() {
		igualQue(zero());
		return me();
	};
}
