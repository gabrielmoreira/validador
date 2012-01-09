package com.validador.validavel;

public abstract class NumericoValidavel<T extends NumericoValidavel<?, ?>, K extends Number> extends ComparavelValidavel<T, K> {
	public NumericoValidavel(String nomeCampo, K valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public NumericoValidavel(String nomeObjeto, String nomeCampo, K valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}
}
