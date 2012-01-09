package com.validador.validavel;

public class IntegerValidavel<T extends IntegerValidavel<?>> extends NumericoValidavel<T, Integer> {

	public IntegerValidavel(String nomeCampo, Integer valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public IntegerValidavel(String nomeObjeto, String nomeCampo, Integer valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
