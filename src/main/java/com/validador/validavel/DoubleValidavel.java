package com.validador.validavel;

public class DoubleValidavel<T extends DoubleValidavel<?>> extends NumericoValidavel<T, Double> {

	public DoubleValidavel(String nomeCampo, Double valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public DoubleValidavel(String nomeObjeto, String nomeCampo, Double valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
