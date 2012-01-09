package com.validador.validavel;

public class LongValidavel<T extends LongValidavel<?>> extends NumericoValidavel<T, Long> {

	public LongValidavel(String nomeCampo, Long valorCampo) {
		super(nomeCampo, valorCampo);
	}

	public LongValidavel(String nomeObjeto, String nomeCampo, Long valorCampo) {
		super(nomeObjeto, nomeCampo, valorCampo);
	}

}
